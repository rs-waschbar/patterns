package org.example.patterns.service.first;


public interface UserService {

    String findUserById(Long id);

    void deleteUser(Long id);
}
