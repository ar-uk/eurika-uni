package com.adil.urethra.team.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {
    private Long id;
    private String name;
    private String nationality;
    private String team;
}