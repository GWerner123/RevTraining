package com.revature.entity;

public class Ticket {

    //private member variables
    private int id;
    private Boolean status;
    private double amount;
    private String description;

    //default constructor
    public Ticket() {

    }

    //fully parameterized constructor
    public Ticket(int id,Boolean status,double amount,String description) {
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.description = description;
    }

    //constructor sans id
    public Ticket(Boolean status,double amount,String description) {
        this.status = status;
        this.amount = amount;
        this.description = description;
    }

    //public getters and setters for member variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", status=" + status +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
