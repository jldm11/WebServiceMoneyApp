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
public interface AccountDao {
    public List<Account> getAccountsFromDB(int idUser);
}
