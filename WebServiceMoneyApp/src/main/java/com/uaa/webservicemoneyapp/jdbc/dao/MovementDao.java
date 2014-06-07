/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Movement;
import java.util.List;
/**
 *
 * @author Jose Luis
 */
public interface MovementDao {
    public List<Movement> getMovementsFromDB(int idMovement);
}
