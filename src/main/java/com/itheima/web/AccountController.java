package com.itheima.web;

import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author：RongJieChen
 * @Date: 2021/4/15 12:02
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //查询所有
    @RequestMapping("/findAll")
    public String findAll(Model model)  {
        System.out.println("查询所有接收到请求==============");
        List<Account> list = accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "success"; //逻辑视图

    }



     //添加
    @RequestMapping("/add")
    public String add() {
        System.out.println("添加接收到请求==============");


        return "success"; //逻辑视图

    }

      //修改
    @RequestMapping("/update")
    public String update() {
        System.out.println("修改接收到请求==============");


        return "success"; //逻辑视图

    }

      //删除
    @RequestMapping("/delete")
    public String delete() {
        System.out.println("删除接收到请求==============");


        return "success"; //逻辑视图

    }



}
