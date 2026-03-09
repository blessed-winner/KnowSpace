package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private String id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Creation_date")
    private Date createdAt;


    @OneToMany(mappedBy = "user")
    private Set<Topic> topics = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<MemoryItem> memoryItems = new LinkedHashSet<>();
}
