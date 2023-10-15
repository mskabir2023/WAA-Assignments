package com.example.homework2.controller;

import com.example.homework2.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
public class ProductController {
    @RequestMapping("/products/get")
    public String getProducts(Model model)
    {
        Product p2= Product.builder().id(771).title("Lenovo").description("Thinkpad").price(750).build();
        Product p3= Product.builder().id(770).title("HP").description("Thinkpad-771").price(850).build();
        Product p4= Product.builder().id(777).title("apple").description("Laptop").price(2850).build();
        var productlist = Arrays.asList(p2,p3,p4);
        model.addAttribute(productlist);
        return "p1";
    }
    @RequestMapping("/products/save")
    public String saveProd(@RequestParam(required = false) String title,Model model1){
        model1.addAttribute("Len1",title);
        return "saveProduct";
    }
    @RequestMapping("/getpathvalue/{pathvalue}")
    public String saveProductbypathvalue(@PathVariable("pathvalue") String id1, Model model){
        model.addAttribute("value",id1);
        return "user1pathvalue";
    }


}
