/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.dom;

/**
 *
 * @author Jose Luis
 */
public class Account {
    public int idAccount;
    public int idUser;
    public char status;
    public String accountName;

    public Account(int idAccount, int idUser, char status, String accountName) {
        this.idAccount = idAccount;
        this.idUser = idUser;
        this.status = status;
        this.accountName = accountName;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    
    
}
