package cc.becurious.system.service.impl;

import cc.becurious.system.domain.User;
import cc.becurious.system.mapper.UserMapper;
import cc.becurious.system.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUserById(Long id) {
        return userMapper.selectUserById(id);
    }
}
