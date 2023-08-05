package com.sebastianrod.hackatoonapisebastian.models;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity(name = "categories")
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private Boolean enable;

}
