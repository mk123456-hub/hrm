package com.dao;

import com.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author Administrator
 * @create 2020/12/14 0014 21:41
 */
@Repository
public class UserDao {
    public List<User> list(){
        return Arrays.asList(
                new User(1001,"zhao","123",new Date(),new BigDecimal("1.2")),
                new User(1002,"qian","123",new Date(),new BigDecimal("1.2")),
                new User(1003,"sun","123",new Date(),new BigDecimal("1.2"))
        );

    }
}
