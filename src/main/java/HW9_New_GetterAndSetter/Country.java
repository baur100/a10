package HW9_New_GetterAndSetter;

public class Country {
    private String name;
    private String continent;
    private int population;
    private int sizeOfarea;

    public Country(String name,String continent, int population, int sizeOfarea){   //Constructor 1
        this.name=name;
        this.continent=continent;
        this.population=population;
        this.sizeOfarea=sizeOfarea;
    }
    public Country(String name, String continent){                                  //Constructor 2
        this.name=name;
        this.continent=continent;
    }
    public Country(){                                                             //Empty Constructor

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getContinent() {
        return this.continent;
    }
    public void setContinent(String continent) {
                this.continent = continent;
    }
    public int getPopulation() {
        return this.population;
    }
    public void setPopulation(int population) {
        if(population>1000000000 || population<1000){
            throw new IllegalArgumentException("Wrong number of population, population must be between 1000 and 1000000000 ");//Проверка населения
        }
        this.population = population;
    }
    public int getSizeOfarea() {
        return this.sizeOfarea;
    }
    public void setSizeOfarea(int sizeOfarea) {
        if(sizeOfarea<1000 ||sizeOfarea>10000000){
            throw new IllegalArgumentException("Wrong size of Area, Area must be between 1000 and 10000000");//проверка Area
        }
        this.sizeOfarea = sizeOfarea;

            }
            public void printCountry(){
                System.out.println("Name = "+this.name+
                        ", Continent = "+this.continent+
                        ", Population = "+this.population+
                        ", Size of Area = "+this.sizeOfarea);
            }
}