package org.xenon.knowspace.repositories;

import org.xenon.knowspace.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
