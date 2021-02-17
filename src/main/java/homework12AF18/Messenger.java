package homework12AF18;

public class Messenger implements Functions {
    private String name;
    private int weight;

    public Messenger(String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void sentMessage(String name) {
        System.out.println("I can sent message to " +name);

    }

    @Override
    public void notification(int timePeriod) {
        System.out.println("I'm gonna show you new updates every "+timePeriod+" minutes.");

    }
}
