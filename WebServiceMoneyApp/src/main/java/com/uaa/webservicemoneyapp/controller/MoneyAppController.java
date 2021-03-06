/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.controller;

import com.uaa.webservicemoneyapp.dom.Account;
import com.uaa.webservicemoneyapp.dom.Detail;
import com.uaa.webservicemoneyapp.dom.Movement;
import com.uaa.webservicemoneyapp.dom.User;
import com.uaa.webservicemoneyapp.jdbc.dao.AccountList;
import com.uaa.webservicemoneyapp.jdbc.dao.DetailList;
import com.uaa.webservicemoneyapp.jdbc.dao.JdbcAccountDao;
import com.uaa.webservicemoneyapp.jdbc.dao.JdbcDetailDao;
import com.uaa.webservicemoneyapp.jdbc.dao.JdbcMovementDao;
import com.uaa.webservicemoneyapp.jdbc.dao.JdbcUserDao;
import com.uaa.webservicemoneyapp.jdbc.dao.MovementList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jose Luis
 */
@Controller
@RequestMapping("/functions")
public class MoneyAppController {

    @Autowired
    JdbcUserDao userJdbc;
    @Autowired
    JdbcAccountDao accountJdbc;
    @Autowired
    JdbcMovementDao movementJdbc;
    @Autowired
    JdbcDetailDao detailJdbc;

    @RequestMapping(method = {RequestMethod.GET}, value = {"/getUser/{email}/{password}"})
    public @ResponseBody
    User getUser(@PathVariable(value = "email") String email,
            @PathVariable(value = "password") String password) {
        return userJdbc.getUserFromDB(email, password);
    }

    @RequestMapping(method = {RequestMethod.GET}, value = {"/getAccount/{idUser}"})
    public @ResponseBody
    AccountList getAccount(@PathVariable(value = "idUser") int idUser) {
        return new AccountList(accountJdbc.getAccountsFromDB(idUser));
    }

    @RequestMapping(method = {RequestMethod.GET}, value = {"/getMovement/{idAccount}"})
    public @ResponseBody
    MovementList getMovement(@PathVariable(value = "idAccount") int idAccount) {
        return new MovementList(movementJdbc.getMovementsFromDB(idAccount));
    }

    @RequestMapping(method = {RequestMethod.GET}, value = {"/getDetail/{idMovement}"})
    public @ResponseBody
    DetailList getDetail(@PathVariable(value = "idMovement") int idMovement) {
        return new DetailList(detailJdbc.getDetailsFromDB(idMovement));
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/insertUser"})
    public @ResponseBody
    void insertUser(@RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "lastName", required = true) String lastName,
            @RequestParam(value = "address", required = true) String address,
            @RequestParam(value = "country", required = true) String country,
            @RequestParam(value = "email", required = true) String email,
            @RequestParam(value = "password", required = true) String password) {
        userJdbc.insertUserToDB(name, lastName, address, country, email, password);
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/insertAccount"})
    public @ResponseBody
    void insertAccount(@RequestParam(value = "idUser", required = true) Integer idUser,
            @RequestParam(value = "status", required = true) String status,
            @RequestParam(value = "accountName", required = true) String accountName) {
        accountJdbc.insertAccountToDB(idUser, accountName, status);
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/insertMovement"})
    public @ResponseBody
    void insertMovement(@RequestParam(value = "idAccount", required = true) Integer idAccount,
            @RequestParam(value = "amount", required = true) Double amount,
            @RequestParam(value = "type", required = true) String type,
            @RequestParam(value = "date", required = true) String date) {
        movementJdbc.insertMovementToDB(idAccount, amount, type, date);
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/insertDetail"})
    public @ResponseBody
    void insertDetail(@RequestParam(value = "idMovement", required = true) Integer idMovement,
            @RequestParam(value = "description", required = true) String description,
            @RequestParam(value = "amount", required = true) Double amount) {
        detailJdbc.insertDetailToDB(idMovement, description, amount);
    }
    
    @RequestMapping(method = {RequestMethod.POST}, value = {"/updateUser"})
    public @ResponseBody
    void updateUser(@RequestParam(value = "idUser", required = true) Integer idUser,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "lastName", required = true) String lastName,
            @RequestParam(value = "address", required = true) String address,
            @RequestParam(value = "country", required = true) String country,
            @RequestParam(value = "email", required = true) String email,
            @RequestParam(value = "password", required = true) String password) {
        userJdbc.updateUserToDB(idUser, name, lastName, address, country, email, password);
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/updateAccount"})
    public @ResponseBody
    void updateAccount(@RequestParam(value = "idAccount", required = true) Integer idAccount,
            @RequestParam(value = "status", required = true) String status,
            @RequestParam(value = "accountName", required = true) String accountName) {
        accountJdbc.updateAccountToDB(idAccount, accountName, status);
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/updateMovement"})
    public @ResponseBody
    void updateMovement(@RequestParam(value = "idMovement", required = true) Integer idMovement,
            @RequestParam(value = "amount", required = true) Double amount,
            @RequestParam(value = "type", required = true) String type,
            @RequestParam(value = "date", required = true) String date) {
        movementJdbc.updateMovementToDB(idMovement, amount, type, date);
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/updateDetail"})
    public @ResponseBody
    void updateDetail(@RequestParam(value = "idDetail", required = true) Integer idDetail,
            @RequestParam(value = "description", required = true) String description,
            @RequestParam(value = "amount", required = true) Double amount) {
        detailJdbc.updateDetailToDB(idDetail, description, amount);
    }
}
