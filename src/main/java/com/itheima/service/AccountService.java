package com.itheima.service;

import com.itheima.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：RongJieChen
 * @Date: 2021/4/16 11:15
 */


public interface AccountService {

    List<Account> findAll();
}
