package com.shea.mall.api.springtutorial.builder;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 14:41
 */
public class Computer {

    private String cpu;
    private String ram;
    private String disk;
    private String keyboard;
    private String mouse;

    public static class Builder {
        private String cpu;
        private String ram;
        private String disk;
        private String keyboard;
        private String mouse;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder disk(String disk) {
            this.disk = disk;
            return this;
        }
        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }
        public Computer build() {
            Computer computer = new Computer();
            computer.cpu = this.cpu;
            computer.ram = this.ram;
            computer.disk = this.disk;
            computer.keyboard = this.keyboard;
            computer.mouse = this.mouse;
            return computer;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
