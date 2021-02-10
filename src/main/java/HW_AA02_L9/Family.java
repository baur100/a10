package HW_AA02_L9;

public class Family {
    private String name;
    private int olderMember;
    private String[] members;

    public Family(String name, int olderMember, String[] members){
        this.name = name;
        this.olderMember = olderMember;
        this.members = members;
    }

    public Family(){};

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getOlderMember(){
        return olderMember;
    }

    public void setOlderMember(int olderMember){
        if(olderMember<0){
            throw new IllegalArgumentException("The age cannot be negative");
        }
        this.olderMember = olderMember;
    }

    public String[] getMembers(){
        return members;
    }

    public void setMembers(String[] members){
        this.members = members;
    }

    public void printClass(){
        System.out.println("Family name is: "+getName()+"\nOlder family member is: "+getOlderMember()+"\nFamily members are: ");
        for(String v:this.members){
            System.out.println(v);
        }
    }


}