package com.yash.projects.stayZen.entity;

import com.yash.projects.stayZen.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer age;
}
