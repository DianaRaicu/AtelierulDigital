package patterns.builder;

public class Computer {
    private String RAM;
    private boolean bluetooth;
    private String storage;
    private String GPU;
    private String CPU;
    private String audio;

  /*  public Computer(String RAM, boolean bluetooth,String storage,String GPU,String CPU,String audio){
        this.RAM=RAM;
        this.bluetooth=bluetooth;
        this.storage=storage;
        this.GPU=GPU;
        this.CPU=CPU;
        this.audio=audio;
    } */
    private Computer(){};

    private Computer(Builder builder){
        this.RAM=builder.RAM;
        this.GPU=builder.GPU;
        this.CPU=builder.CPU;
        this.bluetooth=builder.bluetooth;
        this.audio=builder.audio;
        this.storage=builder.storage;

    }

    static public class Builder{
        private String RAM;
        private boolean bluetooth;
        private String storage;
        private String GPU;
        private String CPU;
        private String audio;

        public Builder(String RAM) {
            this.RAM = RAM;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setAudio(String audio) {
            this.audio = audio;
            return this;
        }

        public Computer build(){
          return  new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "RAM: " + RAM + ", buletooth: " + bluetooth + ", storage: " + storage + ", GPU: " + GPU +", CPU: "+ CPU + " audio:" +audio;
    }
}
