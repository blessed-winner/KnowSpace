package org.xenon.knowspace.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "memory_items")
@AllArgsConstructor
@NoArgsConstructor
public class MemoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "source")
    private String source;

    @Column(name = "last_review")
    private Date lastReviewed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
