package HW_AA02_L9;

public class Work {
    public static void main(String[]args){
        String[] ff = {"sofa, armchair, Table"};
        Home alex = new Home();
        alex.setHouseHolder("Alex");
        alex.setBathrooms(3);
        alex.setBedrooms(2);
        alex.setFurniture(ff);
        alex.printClass();

        String [] f = {"Table", "Sofa", "Chair"};
        Home max = new Home("Max", 0, 1, f);
        max.printClass();

        String [] m = {"Alex","Anna","Max"};
        Family ivanov = new Family();
        ivanov.setName("Ivanov");
        ivanov.setOlderMember(60);
        ivanov.setMembers(m);
        ivanov.printClass();

        String [] mm = {"Peter", "Jhon", "Maria"};
        Family sidorov = new Family("Sidorov", 85, mm);
        sidorov.printClass();

        String [] w = {"screwdriver", "hammer", "saw"};
        Worker petrov = new Worker();
        petrov.setLastName("Petrov");
        petrov.setAge(26);
        petrov.setTools(w);
        petrov.printClass();

        Worker pupkin = new Worker("Pupkin", 37, w);
        pupkin.printClass();
    }
}
