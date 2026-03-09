package org.example.patterns.service.first;

/**
 * Real implementation that simulates a slow external data source.
 * DO NOT MODIFY THIS CLASS.
 */
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

