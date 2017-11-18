/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlineshopback.dao;

import com.mycompany.onlineshopback.dto.Category;
import java.util.List;

/**
 *
 * @author Galaxy
 */
public interface CategoryDao {
    public List<Category> list();
    public Category get(int id);
}
