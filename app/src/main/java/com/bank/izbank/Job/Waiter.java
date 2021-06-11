package com.bank.izbank.Job;

public class Waiter extends Job {
    private final String name="Waiter";
    private final String maxCreditAmount="300000";
    private final String maxCreditInstallment ="40";

    public Waiter() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMaxCreditAmount() {
        return maxCreditAmount;
    }

    @Override
    public String getMaxCreditInstallment() {
        return maxCreditInstallment;
    }
}
