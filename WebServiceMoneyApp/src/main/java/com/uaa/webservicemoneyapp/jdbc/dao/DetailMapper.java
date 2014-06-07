/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Detail;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Jose Luis
 */
public class DetailMapper implements RowMapper<Detail> {

    public Detail mapRow(ResultSet rs, int rowNum) throws SQLException {
        Detail detail = new Detail(
                rs.getInt("idDetail"),
                rs.getInt("idMovement"),
                rs.getString("description"),
                rs.getFloat("amount"));
        return detail;
    }
}
