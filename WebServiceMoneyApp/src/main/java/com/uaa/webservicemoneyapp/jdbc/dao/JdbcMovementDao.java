/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Movement;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Jose Luis
 */
public class JdbcMovementDao extends JdbcDaoSupport implements MovementDao {

    public List<Movement> getMovementsFromDB(int idAccount) {
        String query = "select * from expensesInfo.\"Movement\" where idAccount= ?";
        List<Movement> movements = getJdbcTemplate().query(query,
                new Object[]{idAccount}, new MovementMapper());
        return movements;
    }
                      
    public void insertMovementToDB(int idAccount, float amount, char type, String date) {
        String query = "insert into userInfo.\"Movement\" values( ?, ?, ?, ?)";
        getJdbcTemplate().update(query, idAccount, amount, type, date);
    }
    
    public void updateMovementToDB(int idMovement, float amount, char type, String date) {
        String query = "update expensesInfo.\"Movement\" set amount = ?, type = ?, date = ?"
                + " where idMovement = ?";
        getJdbcTemplate().update(query, amount, type, date);
    }  
}
