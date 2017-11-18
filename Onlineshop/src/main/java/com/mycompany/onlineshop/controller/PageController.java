/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlineshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.onlineshopback.dao.CategoryDao;
import com.mycompany.onlineshopback.dto.Category;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author Galaxy
 */
@Controller
public class PageController {
    @Autowired
    private CategoryDao catogeryDao;
    @RequestMapping(value={"/","/home","/index"})
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickHome", true);
        mv.addObject("title","Home");
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
   
    @RequestMapping(value={"/about"})
    public ModelAndView about(){
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickAbout", true);
        mv.addObject("title","About US");
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
    
    @RequestMapping(value={"/contact"})
    public ModelAndView contact(){
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickContact", true);
        mv.addObject("title","Contact US");
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
    @RequestMapping(value={"/services"})
    public ModelAndView services(){
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickServices", true);
        mv.addObject("title","Services");
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
    @RequestMapping(value={"/product"})
    public ModelAndView product(){
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickProduct", true);
        mv.addObject("title","Product");
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
    @RequestMapping(value={"/show/all/products"})
    public ModelAndView showAllProducts(){
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickAllProduct", true);
        mv.addObject("title","Product");
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
    
    @RequestMapping(value={"/show/catogery/{id}/product"})
    public ModelAndView showCatogeryProducts(@PathVariable("id") int id){
        Category catogory=null;
        catogory=catogeryDao.get(id);
        ModelAndView mv=new ModelAndView("page");
        mv.addObject("userClickCatogeryProduct", true);
        mv.addObject("title",catogory.getName());
        //passing catogery
        mv.addObject("catogery",catogory);
        mv.addObject("catogerys",catogeryDao.list());
        return mv;
    }
}
