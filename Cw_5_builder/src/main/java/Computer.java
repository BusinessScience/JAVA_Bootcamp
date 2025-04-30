public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String disk;
    private String mainBoard;

    public Computer(Builder builder){
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.disk = builder.disk;
        this.mainBoard = builder.mainBoard;
        }

    public static class Builder{
        private String cpu;
        private String gpu;
        private String ram;
        private String disk;
        private String mainBoard;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder gpu(String gpu){
            this.gpu = gpu;
            return this;
        }

        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }

        public Builder disk(String disk){
            this.disk = disk;
            return this;
        }

        public Builder mainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
