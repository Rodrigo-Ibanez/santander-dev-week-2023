package me.dio.service;

import me.dio.domain.model.User;
import java.util.List;

public interface UserService extends CrudService<Long, User> {
    
    List<User> findByName(String name);
    
    User findByAccountNumber(String number);
    
    User findByCardNumber(String number);
    
    List<User> findByFeatureName(String featureName);
    
    List<User> findByNewsTitle(String newsTitle);
}
