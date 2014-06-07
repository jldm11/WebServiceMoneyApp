/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Jose Luis
 */
public class JdbcUserDao extends JdbcDaoSupport implements UserDao {

    public User getUserFromDB(String email, String password) {
        String query = "select idUser, name, lastName, address, country, email from userInfo.\"User\" where email= ? and password= ?";
        try{
        return getJdbcTemplate().queryForObject(query, new Object[]{email, password}, new UserMapper());
        } catch (Exception e){
            return new User(0,"","","","","");
        }
    }

    public void insertUserToDB( String name, String lastName, String address, String country, String email, String password) {
        String query = "insert into userInfo.\"User\" values( ?, ?, ?, ?, ?, ?)";
        getJdbcTemplate().update(query, name, lastName, address, country, email, password);
    }
    
    public void updateUserToDB(int idUser, String name, String lastName, String address, String country, String email, String password) {
        String query = "update userInfo.\"User\" set name = ?, lastName = ?, address = ?, country = ?, email = ?, password = ?"
                + " where idUser = ?";
        getJdbcTemplate().update(query, name, lastName, address, country, email, password, idUser);
    }
}
