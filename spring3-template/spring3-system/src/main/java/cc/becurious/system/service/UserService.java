package cc.becurious.system.service;

import cc.becurious.system.domain.User;

public interface UserService {

    public User selectUserById(Long id);
}
