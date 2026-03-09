package org.example.patterns.service.first;

public class ProxyInterviewRunner {

    public static void main(String[] args) {

        // UserService service = new CachingUserServiceProxy(new UserServiceImpl());
        //
        // System.out.println("Result: " + service.findUserById(1L));  // MISS
        // System.out.println("Result: " + service.findUserById(1L));  // HIT
        // System.out.println("Result: " + service.findUserById(2L));  // MISS
        //
        // service.deleteUser(1L);  // invalidate cache for id=1
        //
        // System.out.println("Result: " + service.findUserById(1L));  // MISS again
    }
}

