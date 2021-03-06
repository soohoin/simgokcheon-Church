package com.church.simgokchyun.biz.sgc_004.controller;


import com.church.simgokchyun.common.common.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sgc_004Controller {

    @Autowired
    CommonService comService;
    
    @RequestMapping("/sgc_004_01")
    String sgc_004_01(Model model) {

        try {
            model.addAttribute("dept_01", comService.getMenu_lv01("MENU04"));
            model.addAttribute("dept_02", comService.getMenu_lv02("MENU04","01"));
            model.addAttribute("img_path", "imgs/page/page_004_bg.jpg");
        }catch(Exception e) {

        }
        return "page/page_004/page_004_01";

    }

    @RequestMapping("/sgc_004_02")
    String sgc_004_02(Model model) {
        try {
            model.addAttribute("dept_01", comService.getMenu_lv01("MENU04"));
            model.addAttribute("dept_02", comService.getMenu_lv02("MENU04","02"));
            model.addAttribute("img_path", "imgs/page/page_004_bg.jpg");
        }catch(Exception e) {

        }
        return "page/page_004/page_004_02";
    }

    @RequestMapping("/sgc_004_03")
    String sgc_004_03(Model model) {
        try {
            model.addAttribute("dept_01", comService.getMenu_lv01("MENU04"));
            model.addAttribute("dept_02", comService.getMenu_lv02("MENU04","03"));
            model.addAttribute("img_path", "imgs/page/page_004_bg.jpg");
        }catch(Exception e) {

        }
        return "page/page_004/page_004_03";
    }

}