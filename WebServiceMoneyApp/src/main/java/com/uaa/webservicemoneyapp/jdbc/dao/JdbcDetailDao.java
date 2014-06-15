/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Detail;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Jose Luis
 */
public class JdbcDetailDao extends JdbcDaoSupport implements DetailDao{

    public List<Detail> getDetailsFromDB(int idMovement) {
        String query = "select * from expensesInfo.\"Detail\" where idMovement= ?";
        List<Detail> details = getJdbcTemplate().query(query,
                new Object[]{idMovement}, new DetailMapper());
        return details;
    }
    
    public void insertDetailToDB(Integer idMovement, String description, Double amount) {
        String query = "insert into expensesInfo.\"Detail\" values( ?, ?, ?)";
        getJdbcTemplate().update(query, idMovement, description, amount);
    }
    
    public void updateDetailToDB(Integer idDetail, String description, Double amount) {
        String query = "update expensesInfo.\"Detail\" set description = ?, amount = ?"
                + " where idDetail = ?";
        getJdbcTemplate().update(query, idDetail, description, amount);
    }
}
