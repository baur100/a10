package homeWork09;

import java.util.Arrays;

public class Castle extends Mansion{
    public String[] extra;

    public Castle(String name, int area, int floors, String[] tenants, Fenses fence, String[] extra) {
        super(name, area, floors, tenants, fence);
        this.extra = extra;
    }

    public String[] getExtras() {return extra;}
    public void setExtras (String[] extra) {this.extra=extra;}

    public Castle() {}

    public void printClass() {
        System.out.println(this.name+" has "+this.squareFeet+" square feet and " + this.floors + " floors, "+fence+" fence and also have "+ Arrays.toString(getExtras())+" and "+ Arrays.toString(tenants)+" live here");
    }

}
