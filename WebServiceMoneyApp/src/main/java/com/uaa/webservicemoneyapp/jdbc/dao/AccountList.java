/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Account;
import java.util.List;

/**
 *
 * @author Jose Luis
 */
public class AccountList {
    List<Account> accounts;

    public AccountList(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    

    
}
