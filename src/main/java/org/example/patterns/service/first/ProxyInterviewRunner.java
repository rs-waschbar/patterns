package org.example.patterns.service.first;

/**
 * Run this class to verify your Proxy implementation.
 *
 * Expected output (approximate):
 *   CACHE MISS for id=1        (slow — ~1 sec)
 *   Result: User_1
 *   CACHE HIT for id=1         (instant)
 *   Result: User_1
 *   CACHE MISS for id=2        (slow — ~1 sec)
 *   Result: User_2
 *   User with id=1 deleted from data source.
 *   CACHE MISS for id=1        (slow — ~1 sec, because cache was invalidated)
 *   Result: User_1
 */
public class ProxyInterviewRunner {

    public static void main(String[] args) {
        // TODO: uncomment the lines below once CachingUserServiceProxy implements UserService

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

