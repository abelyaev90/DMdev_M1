package com.dmdev.week2.homework.cycles;

/**
 * Update branch
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {
    public static void main(String[] args) {
        int salary = 600;
        int upSalary = 400;
        int upGradePeriod = 6;
        int currentExpenses = 300;
        double profitability = 0.02;
        double partSalaryForInvestments = 0.1;
        int periodMonth = 38;
        double resultBankAccount = remainderSalary(salary, currentExpenses, upSalary, upGradePeriod, periodMonth, partSalaryForInvestments);
        double resultBrokerAccount = resultInvestment(salary, upSalary, upGradePeriod, partSalaryForInvestments, profitability, periodMonth);

        System.out.println("Накопления на банковском счете = " + resultBankAccount);
        System.out.println("Накопления на брокерском счете = " + resultBrokerAccount);

    }

    private static double resultInvestment(int salary, int upSalary, int upGradePeriod, double partSalaryForInvestments, double profitability, int periodMonth) {
        double result = 0;
        double brokerResult = 0;
        int count = 1;
        for (int i = 1; i <= periodMonth; i++) {
            if (i == upGradePeriod * count) {
                salary += upSalary;
                count++;
            }
            result += salary * partSalaryForInvestments;
            brokerResult = (brokerResult + result) * profitability;
            System.out.print(i + " месяц : з/п " + salary);
            System.out.println();
        }
        return brokerResult;
    }

    private static double remainderSalary(int salary, int currentExpenses, int upSalary, int upGradePeriod, int periodMonth, double partSalaryForInvestments) {
        double result = 0;
        int count = 1;
        for (int i = 1; i <= periodMonth; i++) {
            if (i == upGradePeriod * count) {
                salary += upSalary;
                count++;
            }
            result += salary - currentExpenses - (salary * partSalaryForInvestments);
        }
        return result;
    }
}
