package com.codegym.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    @ManyToOne
    private Country country;
    @Min(value = 1)
    private double area;
    @Min(value =1)
    private int population;
    @Min(value =1)
    private double gdp;
    private String description;
}
