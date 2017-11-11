package com.task.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.task.model.Category;
import com.task.model.Category_;
import com.task.service.CategoryService;
import com.task.units.Page;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "",method = RequestMethod.GET)
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    //设置log4j
    static Logger logger = Logger.getLogger(CategoryController.class);

    @RequestMapping(value = "0", method = RequestMethod.GET)
    public String tetView(Model model) {
        int listState=categoryService.listState();
        int listStateAlready=categoryService.listStateAlready();
        List<Category> listStateAll= categoryService.listStateAll();
        model.addAttribute("listState",listState);
        model.addAttribute("listStateAlready",listStateAlready);
        model.addAttribute("listStateAll",listStateAll);
        return "T10";
    }


    @RequestMapping(value = "1", method = RequestMethod.GET)
    public String etView(Model model) {
        //打印职业介绍
        List<Category_> listOcc= categoryService.listOcc();
        model.addAttribute("listOcc",listOcc);

        //根据学员人数获取职业入学信息
        Category NumericalValue=new Category();
        //前端web
        NumericalValue.setDirection("前端");
        NumericalValue.setOccupation("web");
        model.addAttribute("FrontWeb",categoryService.listOccDir(NumericalValue));
        //前端wab
        NumericalValue.setDirection("前端");
        NumericalValue.setOccupation("wab");
        model.addAttribute("FrontWab",categoryService.listOccDir(NumericalValue));
        //前端tab
        NumericalValue.setDirection("前端");
        NumericalValue.setOccupation("tab");
        model.addAttribute("FrontTab",categoryService.listOccDir(NumericalValue));
        //后端web
        NumericalValue.setDirection("后端");
        NumericalValue.setOccupation("web");
        model.addAttribute("AfterWeb",categoryService.listOccDir(NumericalValue));
        //后端wab
        NumericalValue.setDirection("后端");
        NumericalValue.setOccupation("wab");
        model.addAttribute("AfterWab",categoryService.listOccDir(NumericalValue));
        //后端tab
        NumericalValue.setDirection("后端");
        NumericalValue.setOccupation("tab");
        model.addAttribute("AfterTab",categoryService.listOccDirAll(NumericalValue));


        return "T11";
    }

}
