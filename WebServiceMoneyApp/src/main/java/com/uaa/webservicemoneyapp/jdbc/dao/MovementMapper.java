/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Movement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Jose Luis
 */
public class MovementMapper implements RowMapper<Movement>{

    public Movement mapRow(ResultSet rs, int i) throws SQLException {
        Movement movement = new Movement(
                rs.getInt("idMovement"), 
                rs.getInt("idAccount"), 
                rs.getFloat("amount"), 
                rs.getString("type").toCharArray()[0],
                rs.getString("date"));
        return movement;
    }
    
}
