package repositories;

import entities.MemoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoryItemRepository extends JpaRepository<MemoryItem, Long> {
}
