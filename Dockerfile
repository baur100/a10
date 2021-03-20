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
ARG CHROME_VERSION=89.0.4389.90
ARG CHROMDRIVER_VERSION=89.0.4389.23

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

#Step 4: Copy project to container
COPY ./pom.xml /app
COPY testng.xml /app
WORKDIR /app
COPY ./src /app/src
CMD mvn clean test

#version: latest
#container_name: project
#username: docker hub username

# to build
# docker build .

# to push to dockerhub
# docker push <USERNAME>/<CONTAINER_NAME>:<version>
# docker push smarot/a10:latest

# to download from dockerhub
# docker pull <USERNAME>/<CONTAINER_NAME>:<version>
# docker pull smarot/a10:latest

# to run container
# docker run <USERNAME>/<CONTAINER_NAME>:<version>
# docker run smarot/a10