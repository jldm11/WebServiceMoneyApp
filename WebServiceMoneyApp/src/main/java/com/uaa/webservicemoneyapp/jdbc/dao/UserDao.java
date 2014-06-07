/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.User;
/**
 *
 * @author Jose Luis
 */
public interface UserDao {
    public User getUserFromDB(String email, String password);
}
