FROM maven:3.6.3-jdk-11
#Step 1 : Install the pre-requisite
RUN apt-get update
RUN apt-get install -y curl
RUN apt-get install -y p7zip \
    p7zip-full \
    unace \
    zip \
    unzip \
    bzip2 \
    xdg-utils

#Version numbers
ARG FIREFOX_VERSION=85.0.2
ARG CHROME_VERSION=89.0.4389.90
ARG CHROMDRIVER_VERSION=89.0.4389.23
ARG FIREFOXDRIVER_VERSION=0.28.0

#Step 2: Install Chrome
RUN curl http://dl.google.com/linux/chrome/deb/pool/main/g/google-chrome-stable/google-chrome-stable_$CHROME_VERSION-1_amd64.deb -o /chrome.deb
RUN dpkg -i /chrome.deb; apt-get install -f -y
RUN rm /chrome.deb

#Step 3: Install chromedriver for Selenium
RUN mkdir -p /app
RUN curl https://chromedriver.storage.googleapis.com/$CHROMDRIVER_VERSION/chromedriver_linux64.zip -o /tmp/chromedriver.zip \
    && unzip /tmp/chromedriver.zip -d /app/ \
    && rm /tmp/chromedriver.zip
RUN chmod +x /app/chromedriver
#Step 4 : Install firefox
RUN wget --no-verbose -O /tmp/firefox.tar.bz2 https://download-installer.cdn.mozilla.net/pub/firefox/releases/$FIREFOX_VERSION/linux-x86_64/en-US/firefox-$FIREFOX_VERSION.tar.bz2 \
  && bunzip2 /tmp/firefox.tar.bz2 \
  && tar xvf /tmp/firefox.tar \
  && mv /firefox /opt/firefox-$FIREFOX_VERSION \
  && ln -s /opt/firefox-$FIREFOX_VERSION/firefox /usr/bin/firefox
#Step 5: Install Geckodriver
RUN wget https://github.com/mozilla/geckodriver/releases/download/v$FIREFOXDRIVER_VERSION/geckodriver-v$FIREFOXDRIVER_VERSION-linux64.tar.gz \
    && tar -xf geckodriver-v$FIREFOXDRIVER_VERSION-linux64.tar.gz \
    && cp geckodriver /app/geckodriver
RUN chmod +x /app/geckodriver

COPY ./pom.xml /app
COPY testngChrome.xml /app
COPY testngFirefox.xml /app
WORKDIR /app
# RUN mvn dependency:resolve

#Making our working directory as /app
COPY ./src /app/src
CMD mvn clean test

# to build
# docker build . -t

# to push to dockerhub
# docker push <USERNAME>/<CONTAINER_NAME>:<version>
# docker push smarot/a10:latest

# to download from dockerhub
# docker pull <USERNAME>/<CONTAINER_NAME>:<version>
# docker pull smarot/a10:latest

# to run container
# docker run <USERNAME>/<CONTAINER_NAME>:<version>
# docker run smarot/a10

#version: latest
#container_name: project
#username: docker hub username