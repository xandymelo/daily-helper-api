package com.project.daily.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;


@Table(name = "members")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member extends Base {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ip")
    private String ip;

    @Column(name = "role_id")
    private Integer roleId;

    @ManyToMany(mappedBy = "members")
    private Set<Team> teams = new HashSet<>();

    @OneToMany(mappedBy = "member")
    private Set<Entry> entries = new HashSet<>();

    @OneToMany(mappedBy = "scrumMaster")
    @ToString.Exclude
    private Set<Team> teamsAsScrumMaster = new HashSet<>();
}
