/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Jose Luis
 */
public class AccountMapper implements RowMapper<Account> {

    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account(
                rs.getInt("idAccount"),
                rs.getInt("idUser"),
                rs.getString("status").toCharArray()[0],
                rs.getString("accountName"));
        return account;
    }
}
