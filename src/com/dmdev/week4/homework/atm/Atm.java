package com.dmdev.week4.homework.atm;

public class Atm {

    private int fiftyDenomination;
    private int twentyDenomination;
    private int tenDenomination;

    public Atm(int fiftyDenomination, int twentyDenomination, int tenDenomination) {
        this.fiftyDenomination = fiftyDenomination;
        this.twentyDenomination = twentyDenomination;
        this.tenDenomination = tenDenomination;
    }

    public int getFiftyDenomination() {
        return fiftyDenomination;
    }

    public int getTwentyDenomination() {
        return twentyDenomination;
    }

    public int getTenDenomination() {
        return tenDenomination;
    }

    public void setFiftyDenomination(int fiftyDenomination) {
        this.fiftyDenomination = fiftyDenomination;
    }

    public void setTwentyDenomination(int twentyDenomination) {
        this.twentyDenomination = twentyDenomination;
    }

    public void setTenDenomination(int tenDenomination) {
        this.tenDenomination = tenDenomination;
    }

    public boolean isGetCash(int sum) {
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;

        if (sum % 10 != 0 || sum > fiftyDenomination * 50 + twentyDenomination * 20 + tenDenomination * 10) {
            return false;
        }
        if (sum > 0) {
            while (sum >= 50 && fiftyDenomination > 0) {
                sum -= 50;
                count50++;
                fiftyDenomination--;
            }

            if (sum >= 20) {
                while (sum >= 20 && twentyDenomination > 0) {
                    sum -= 20;
                    count20++;
                    twentyDenomination--;
                }

            }
            if (sum >= 10) {
                while (sum >= 10 && tenDenomination > 0) {
                    sum -= 10;
                    count10++;
                    tenDenomination--;
                }

            }
        }
        System.out.println("50 " + count50 + " шт.");
        System.out.println("20 " + count20 + " шт.");
        System.out.println("10 " + count10 + " шт.");

        return true;
    }

    public void setCash(int count, int denomination) {
        if (count <= 0) {
            System.out.println("Количество вносимых купюр должно быть больше 0");
        } else if (denomination == 50 || denomination == 20 || denomination == 10) {
            if (denomination == 50) {
                fiftyDenomination += count;
            } else if (denomination == 20) {
                twentyDenomination += count;
            } else {
                tenDenomination += 10;
            }
        } else {
            System.out.println("Банкомат принимает купюры номиналом 50," +
                               " 20 или 10 рублей, подготовьте купюры данного номинала");
        }
    }
}
