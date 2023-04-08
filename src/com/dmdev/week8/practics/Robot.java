package com.dmdev.week8.practics;

public class Robot {

    private Detail head;
    private Detail body;
    private Detail leftFoot;
    private Detail rightFoot;
    private Detail rightHand;
    private Detail leftHand;
    private Detail cpu;
    private Detail ram;
    private Detail hdd;

    public Robot(Detail head, Detail body, Detail leftFoot, Detail rightFoot, Detail rightHand,
                 Detail leftHand, Detail cpu, Detail ram, Detail hdd) {
        this.head = head;
        this.body = body;
        this.leftFoot = leftFoot;
        this.rightFoot = rightFoot;
        this.rightHand = rightHand;
        this.leftHand = leftHand;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
}
