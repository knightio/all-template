package cc.becurious.system.mapper;

import cc.becurious.system.domain.User;

public interface UserMapper {

    public User selectUserById(Long id);
}
