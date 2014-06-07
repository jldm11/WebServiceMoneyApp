/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Jose Luis
 */
public class UserMapper implements RowMapper<User> {
   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
      User user = new User(
               rs.getInt("idUser"),
               rs.getString("name"),
               rs.getString("lastName"),
               rs.getString("country"),
               rs.getString("address"),
               rs.getString("email"));
      return user;
   }
}
