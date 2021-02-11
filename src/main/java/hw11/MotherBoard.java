package hw11;

public class MotherBoard {
        private String brand;
        private String model;
        private Cpu cpu;
        private int ram;

        public MotherBoard(String brand, String model, Cpu cpu, int ram) {
                this.brand = brand;
                this.model = model;
                this.cpu = cpu;
                this.ram = ram;
        }

        public MotherBoard() {}

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public Cpu getCpu() {
                return cpu;
        }

        public void setCpu(Cpu cpu) {
                this.cpu = cpu;
        }

        public int getRam() {
                return ram;
        }

        public void setRam(int ram) {
                this.ram = ram;
        }
}
