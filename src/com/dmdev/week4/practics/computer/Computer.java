package com.dmdev.week4.practics.computer;

public abstract class Computer {

    private Ssd ssd;
    private Ram ram;

//    public Computer(Ssd ssd, Ram ram) {
//        this.ssd = ssd;
//        this.ram = ram;
//    }

//    public Computer() {
//        this(null, null);
//    }

    //public abstract void load();

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
