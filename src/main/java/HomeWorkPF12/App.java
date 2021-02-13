package HomeWorkPF12;

public class App {
    public static void main(String[] args) {
        CropDSRLCamera canon7D = new CropDSRLCamera();
        FullSensorCamera canon1dxm2 = new FullSensorCamera("1dxm2",2018);
        canon7D.useCFastCardFor4K();
        canon1dxm2.useCFastCardFor4K();

        MemoryForDSRLCamera camera1 = new CropDSRLCamera();
        MemoryForDSRLCamera camera2 = new FullSensorCamera("5D",2015);
        MemoryForDSRLCamera[] cameras = {camera1,camera2,canon7D,canon1dxm2};

        for (MemoryForDSRLCamera camera : cameras){
            camera.useCompactFlashCard();
        }


    }
}
