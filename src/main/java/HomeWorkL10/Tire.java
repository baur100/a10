package HomeWorkL10;

public class Tire {
    private String company;
    private Seasons[] seasons;

    public Tire(String company,Seasons[] seasons){
        this.company=company;
        this.seasons=seasons;

    }
    public Tire(){

    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }

    public Seasons[] getSeasons() {
        return seasons;
    }

    public void setSeasons(Seasons[] seasons) {
        this.seasons = seasons;
    }
}
