package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author：RongJieChen
 * @Date: 2021/4/16 11:26
 */
public interface AccountDao {

    @Select("select * from  account")
    List<Account> findAll();
}
