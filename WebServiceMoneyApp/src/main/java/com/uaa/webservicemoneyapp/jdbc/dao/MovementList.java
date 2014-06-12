/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Account;
import com.uaa.webservicemoneyapp.dom.Movement;
import java.util.List;

/**
 *
 * @author Jose Luis
 */
public class MovementList {
    List<Movement> movements;

    public MovementList(List<Movement> movements) {
        this.movements = movements;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }
    
}
