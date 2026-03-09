package org.example.patterns.service.first;

public class UserServiceImpl implements UserService {

    @Override
    public String findUserById(Long id) {
        simulateSlowService();
        return "User_" + id;
    }

    @Override
    public void deleteUser(Long id) {
        simulateSlowService();
        System.out.println("User with id=" + id + " deleted from data source.");
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(1000); // simulate latency
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

