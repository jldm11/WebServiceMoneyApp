/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.dom;

/**
 *
 * @author Jose Luis
 */
public class Movement {
    public int idMovement;
    public int idAccount;
    public float amount;
    public char type;
    public String date;

    public Movement(int idMovement, int idAccount, float amount, char type, String date) {
        this.idMovement = idMovement;
        this.idAccount = idAccount;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public int getIdMovement() {
        return idMovement;
    }

    public void setIdMovement(int idMovement) {
        this.idMovement = idMovement;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
