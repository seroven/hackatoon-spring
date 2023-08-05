package com.sebastianrod.hackatoonapisebastian.models.custom;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthToken {

    private String statusCoda;
    private String token;
    private Integer usuario;

}
