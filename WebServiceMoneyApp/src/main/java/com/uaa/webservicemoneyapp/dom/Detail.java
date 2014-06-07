/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaa.webservicemoneyapp.dom;

/**
 *
 * @author Jose Luis
 */
public class Detail {
    public int idDetail;
    public int idMovement;
    public String description;
    public float amount;

    public Detail(int idDetail, int idMovement, String description, float amount) {
        this.idDetail = idDetail;
        this.idMovement = idMovement;
        this.description = description;
        this.amount = amount;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getIdMovement() {
        return idMovement;
    }

    public void setIdMovement(int idMovement) {
        this.idMovement = idMovement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
}
