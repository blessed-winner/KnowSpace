package org.xenon.knowspace.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String email;

    private String password;

    @Column(name = "creation_date")
    private Date createdAt;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Topic> topics = new HashSet<>();

    @OneToMany(mappedBy = "user", fetch =  FetchType.LAZY)
    private Set<MemoryItem> memoryItems = new HashSet<>();
}
