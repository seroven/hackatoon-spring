package com.sebastianrod.hackatoonapisebastian.models;

import jakarta.persistence.*;
import lombok.*;
@Data
@Builder
@Entity(name = "clients")
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String password;

    private Boolean enable;





}
