package HWPF10;

public class App {
    public static void main(String[] args) {
        String[] subj ={"Editing","Delivery"};
        String[] subjects= {"Flash","Reflector"};
        LightAs dino = new LightAs("Dino","Zaur",1990,subjects);
        Photographer toni = new Photographer("Star","Toni",1990,"Shooting");
        Editor jora = new Editor("Jora","Aroj",1980,subj,"Ottawa");
    }
}