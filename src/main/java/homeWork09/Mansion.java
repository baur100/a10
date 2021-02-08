package homeWork09;

import java.util.Arrays;

    public class Mansion extends  SimpleHouse{
    protected Fenses fence;

    public Mansion (String name, int area, int floors, String[] tenants, Fenses fence) {
        super(name, area, floors, tenants);
        this.fence = fence;
    }

    public Mansion() {}

    public Fenses getFence() {return fence;}
    public void setFence(Fenses fence) { this.fence=fence;}

    public void printClass() {
        System.out.println(this.name+" has "+this.squareFeet+" square feet and " + this.floors + " floors, "+fence+" fence and "+ Arrays.toString(tenants)+" live here");
    }


}
