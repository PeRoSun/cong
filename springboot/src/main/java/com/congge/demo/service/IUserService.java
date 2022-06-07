package com.congge.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.congge.demo.controller.dto.UserDTO;
import com.congge.demo.controller.dto.UserPasswordDTO;
import com.congge.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);

    Page<User> findPage(Page<User> objectPage, String username, String email, String address);
}



//    @Autowired
//    private UserMapper userMapper;

//
//    public int save(User user){
//        if(user.getId() == null){  //user没有id则表示是新增否则为更新
//            return userMapper.insert(user);
//        }else{
//          return userMapper.update(user);
//        }
//    }

