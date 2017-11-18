/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlineshopback.daoimpl;

import com.mycompany.onlineshopback.dao.CategoryDao;
import com.mycompany.onlineshopback.dto.Category;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Galaxy
 */
@Repository("catogeryDao")
public class CatgoryDAOImpl implements CategoryDao{

    private static List<Category> catogeryList=new ArrayList<>();
    static{
        Category catogery=new Category();
        catogery.setId(1);
        catogery.setName("Mobiles");              
        catogery.setDescreption("mobile");
        catogery.setImageUrl("img1.png");
        catogeryList.add(catogery);
        catogery=new Category();
        catogery.setId(2);
        catogery.setName("Laptops");              
        catogery.setDescreption("Laptops");
        catogery.setImageUrl("Lap.png");
        catogeryList.add(catogery);
        catogery=new Category();
        catogery.setId(3);
        catogery.setName("Electoroniks-Items");              
        catogery.setDescreption("Electoroniks-Items");
        catogery.setImageUrl("Electoroniks-Items.png");
        catogeryList.add(catogery);
        
          }
  
    @Override
    public List<Category> list() {
        return catogeryList;
    }

    @Override
    public Category get(int id) {
        for(Category catogery : catogeryList)
        {
            if(catogery.getId()==id) return catogery;
        }
            return null;
    }
    
}
