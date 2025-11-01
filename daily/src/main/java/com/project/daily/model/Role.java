package com.project.daily.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Id
    @Column(name = "uuid", nullable = false, unique = true)
    private UUID uuid;

    @Column(name = "removed_at")
    private LocalDateTime removedAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "name", nullable = false)
    private String name;
}