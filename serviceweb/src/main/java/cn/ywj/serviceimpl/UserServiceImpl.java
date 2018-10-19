package cn.ywj.serviceimpl;

import cn.ywj.bean.User;
import cn.ywj.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class  UserServiceImpl implements UserService{

    @Override
    public User findById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("ywj");
        return user;
    }
}
