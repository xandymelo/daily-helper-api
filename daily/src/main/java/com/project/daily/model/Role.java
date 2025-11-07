package com.project.daily.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role extends Base {

    @Column(name = "name", nullable = false)
    private String name;
}