package com.example.lab7.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categories")
@Getter
@Setter
@JsonIgnoreProperties(value = {"picture"})

public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playerId", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Lob
    @Column(name = "mmr")
    private String MMR;

    @Column(name = "position", nullable= false)
    private Integer position;

    @Column(name = "region", nullable = false, length = 100)
    private String region;
}
