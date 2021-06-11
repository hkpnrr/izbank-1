package com.bank.izbank.Job;

public class Teacher extends Job {
    private final String name="Teacher";
    private final String maxCreditAmount="300000";
    private final String maxCreditInstallment ="40";

    public Teacher() {
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
