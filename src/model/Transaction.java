package model;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private int amount;

    public Transaction(LocalDate date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate date() {
        return date;
    }

    public int amount() {
        return amount;
    }
}
