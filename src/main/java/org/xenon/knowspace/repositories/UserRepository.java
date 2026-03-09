package org.xenon.knowspace.repositories;

import org.xenon.knowspace.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
