/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlineshopback.dto;

/**
 *
 * @author Galaxy
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Category 
{
    
    /*
    *private property
    */
    
    private int id;
    private String name;
    private String descreption;
    private String imageUrl;
    private boolean active=true;
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        java.lang.String oldName = this.name;
        this.name = name;
        
    }

    /**
     * @return the descreption
     */
    public String getDescreption() {
        return descreption;
    }

    /**
     * @param descreption the descreption to set
     */
    public void setDescreption(String descreption) {
        java.lang.String oldDescreption = this.descreption;
        this.descreption = descreption;
       
    }

    /**
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        java.lang.String oldImageUrl = this.imageUrl;
        this.imageUrl = imageUrl;
        
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        boolean oldActive = this.active;
        this.active = active;
       
    }
}
