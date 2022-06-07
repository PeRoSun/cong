package com.congge.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.controller.dto.UserPasswordDTO;
import com.congge.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    @Update("update sys_user set password = #{newPassword} where username = #{username} and password = #{password}")
    int updatePassword(UserPasswordDTO userPasswordDTO);

    Page<User> findPage(Page<User> page, @Param("username") String username, @Param("email") String email, @Param("address") String address);

//    @Select("SELECT * FROM sys_user")
//    List<User> finaAll();
//
//    @Insert("INSERT INTO sys_user(username,PASSWORD,nickname,email,phone,address) VALUES (#{username},#{password},#{nickname},#{email},#{phone},#{address});")
//    int insert(User user);
//
//
//    int update(User user);
//
//    @Delete("delete  from sys_user where id = #{id}")
//    Integer deleteById(@PathVariable("id") Integer id);
//
//
//    @Select("select * from sys_user where username like  #{username} limit #{pageNum},#{pageSize} ")
//    List<User> selectPage(Integer pageNum, Integer pageSize,String username);
//
//    @Select("select count(*) from sys_user where username like concat('%', #{username}, '%')")
//    Integer selectTotal(String username);
}
   