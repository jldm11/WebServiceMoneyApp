/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.jdbc.dao;

import com.uaa.webservicemoneyapp.dom.Account;
import com.uaa.webservicemoneyapp.dom.Detail;
import java.util.List;

/**
 *
 * @author Jose Luis
 */
public class DetailList {
    List<Detail> details;

    public DetailList(List<Detail> entityList) {
        this.details = entityList;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

}
