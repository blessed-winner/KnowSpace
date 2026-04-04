package org.xenon.knowspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xenon.knowspace.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
}
