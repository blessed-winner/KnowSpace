package org.xenon.knowspace.repositories;

import org.xenon.knowspace.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
