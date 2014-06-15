/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Account;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Jose Luis
 */
public class JdbcAccountDao extends JdbcDaoSupport implements AccountDao {

    public List<Account> getAccountsFromDB(int idUser) {
        String query = "select * from userInfo.\"Account\" where idUser= ?";
        List<Account> accounts = getJdbcTemplate().query(query,
                new Object[]{idUser}, new AccountMapper());
        return accounts;
    }

    public void insertAccountToDB(Integer idUser, String accountName, String status) {
        String query = "insert into userInfo.\"Account\" values(?, ?, ?)";
        getJdbcTemplate().update(query, idUser, status, accountName);
    }
    
    public void updateAccountToDB(Integer idAccount, String accountName, String status) {
        String query = "update userInfo.\"Account\" set accountName = ?, status = ?"
                + " where idAccount = ?";
        getJdbcTemplate().update(query, idAccount, accountName,  status);
    }
}
