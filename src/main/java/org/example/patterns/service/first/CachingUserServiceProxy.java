package org.example.patterns.service.first;

/**
 * ===== TODO: Implement this class =====
 *
 * This proxy should:
 *   1. Implement {@link UserService}.
 *   2. Accept a {@link UserService} delegate via the constructor.
 *   3. Cache results of {@code findUserById} in a Map (id → result).
 *      - On CACHE MISS: call the delegate, store the result, print "CACHE MISS for id=<id>".
 *      - On CACHE HIT:  return the cached value, print "CACHE HIT for id=<id>".
 *   4. Delegate {@code deleteUser} directly to the real service and invalidate
 *      the cached entry for that id (if any).
 *
 * Bonus: make it thread-safe using ConcurrentHashMap or synchronized blocks.
 */
public class CachingUserServiceProxy {

    // TODO: implement
}

