package com.dmdev.week4.homework.atm;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm(2, 200,10);
        int cash = 250;
        System.out.println("Запрашиваемая вами сумма = " + cash);
        System.out.println("В банкомате имеется след. кол-во купюр: ");
        System.out.println("Купюр номиналом 50 руб.: " + atm.getFiftyDenomination() + " шт.");
        System.out.println("Купюр номиналом 20 руб.: " + atm.getTwentyDenomination() + " шт.");
        System.out.println("Купюр номиналом 10 руб.: " + atm.getTenDenomination() + " шт.");
        System.out.println(atm.isGetCash(cash));
        System.out.println("В банкомате осталось след. кол-во купюр: ");
        System.out.println("Купюр номиналом 50 руб.: " + atm.getFiftyDenomination() + " шт.");
        System.out.println("Купюр номиналом 20 руб.: " + atm.getTwentyDenomination() + " шт.");
        System.out.println("Купюр номиналом 10 руб.: " + atm.getTenDenomination() + " шт.");
        System.out.println();
        atm.setCash(-1, 50);
        atm.setCash(10, 20);
        atm.setCash(10, 10);
        atm.setCash(10, 5);
        System.out.println("Купюр номиналом 50 руб.: " + atm.getFiftyDenomination() + " шт.");
        System.out.println("Купюр номиналом 20 руб.: " + atm.getTwentyDenomination() + " шт.");
        System.out.println("Купюр номиналом 10 руб.: " + atm.getTenDenomination() + " шт.");

    }

}
