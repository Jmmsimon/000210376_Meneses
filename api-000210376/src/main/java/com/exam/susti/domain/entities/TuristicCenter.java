package com.exam.susti.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TuristicCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @PositiveOrZero
    private Double fee;

    private String distance;

    @ManyToOne
    @JoinColumn(name = "id_turistic_center", nullable = false, foreignKey = @ForeignKey(name = "FK_type_turistic_center_turistic_center"))
    private TypeTuristicCenter typeTuristicCenter;

}
