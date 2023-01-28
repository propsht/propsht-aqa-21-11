package HomeWork.OOP;

import java.util.Objects;

public abstract class Computer {

        private int CPU;
        private int HD;
        private boolean Display;
        private int Memory;
        private String Brand;

        public Computer (String brand){
                this.Brand = brand;
        }
        public Computer(){
                this("Some Brand in Computer");
        }

        public void display(){
                System.out.println("Minimum 16");
        }

        public abstract String keybord();

        @Override
        public String toString() {
                return "Computer{" +
                        "CPU=" + CPU +
                        ", HD=" + HD +
                        ", Display=" + Display +
                        ", Memory=" + Memory +
                        ", Brand='" + Brand + '\'' +
                        '}';
        }

        public int getCPU() {
                return CPU;
        }

        public void setCPU(int CPU) {
                if (CPU < 0 || CPU > 32){
                        System.out.println("What is the MONSTER?");
                        return;
                }
                this.CPU = CPU;
        }

        public int getHD() {
                return HD;
        }

        public void setHD(int HD) {
                this.HD = HD;
        }

        public boolean isDisplay() {
                return Display;
        }

        public void setDisplay(boolean display) {
                Display = display;
        }

        public int getMemory() {
                return Memory;
        }

        public void setMemory(int memory) {
                Memory = memory;
        }

        public String getBrand() {
                return Brand;
        }

        public void setBrand(String brand) {
                Brand = brand;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Computer computer = (Computer) o;
                return CPU == computer.CPU
                        && HD == computer.HD
                        && Display == computer.Display
                        && Memory == computer.Memory
                        && Objects.equals(Brand, computer.Brand);
        }

        @Override
        public int hashCode() {
                return Objects.hash(CPU, HD, Display, Memory, Brand);
        }
}
