package homework12AF18;

public class MediaApplication implements Functions{
    private String name;
    private int version;
    public MediaApplication(String name,int version){
        this.name=name;
        this.version=version;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setVersion(int version){
        this.version=version;
    }
    public int getVersion(){
        return this.version;
    }

    @Override
    public void sentMessage(String typeOfFiles) {
        System.out.println("I can sent your "+ typeOfFiles+" media-files throw message.");

    }

    @Override
    public void notification(int numberOfTop) {
        System.out.println("You will see best " +numberOfTop+" media in the world.");

    }
}
