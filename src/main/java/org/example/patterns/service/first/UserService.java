package org.example.patterns.service.first;

/**
 * ===== INTERVIEW TASK: Proxy Pattern =====
 *
 * Context:
 * We have a {@link UserService} interface and its implementation {@link UserServiceImpl}
 * that fetches user data from a slow external source (simulated with Thread.sleep).
 *
 * YOUR TASK:
 * Implement the {@link CachingUserService} class that:
 *   1. Implements the {@link UserService} interface.
 *   2. Wraps an instance of {@link UserServiceImpl} (passed via constructor).
 *   3. Caches the results of {@code findUserById} — if the same id is requested again,
 *      return the cached result without calling the real service.
 *   4. Logs (System.out.println) every call to {@code findUserById}, printing whether
 *      it was a CACHE HIT or a CACHE MISS.
 *
 * Requirements:
 *   - Do NOT modify {@link UserService} or {@link UserServiceImpl}.
 *   - The proxy must be transparent: callers should use it via the {@link UserService} interface.
 *
 * Bonus:
 *   - Make the proxy thread-safe.
 *
 * See {@link UserServiceRunner#main} to verify your solution.
 */
public interface UserService {

    String findUserById(Long id);

    void deleteUser(Long id);
}
