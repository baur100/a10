package HomeWorkPF12;

public class CropDSRLCamera implements MemoryForDSRLCamera{


    @Override
    public void useCompactFlashCard() {
        System.out.println("There is connection for CF");

    }

    @Override
    public void useCFastCardFor4K() {
        System.out.println("It is not necessary");

    }
}
