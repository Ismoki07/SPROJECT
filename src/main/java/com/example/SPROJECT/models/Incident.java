package com.example.SPROJECT.models;

import com.example.SPROJECT.enums.Assignation;
import com.example.SPROJECT.enums.CategorieIncident;
import com.example.SPROJECT.enums.Priorite;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "incidents")
@Transactional
public class Incident implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CategorieIncident categorie;

    @Column(nullable = false)
    private String description;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Priorite ordrePriorite;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Assignation assignerA;

    @Column(nullable = false)
    private LocalDateTime dateCreation;

    @Column(nullable = false)
    private LocalDateTime dateResolution;

    @OneToMany(mappedBy = "incident")
    @JsonIgnore
    @JsonManagedReference
    private List<Rapport> rapports;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}