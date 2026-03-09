package org.xenon.knowspace.repositories;

import org.xenon.knowspace.entities.MemoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoryItemRepository extends JpaRepository<MemoryItem, Long> {
}
