package org.xenon.knowspace.repositories;

import org.xenon.knowspace.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
