/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Detail;
import java.util.List;
/**
 *
 * @author Jose Luis
 */
public interface DetailDao {
    public List<Detail> getDetailsFromDB(int idAccount);
}
