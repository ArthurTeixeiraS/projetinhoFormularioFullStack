package com.api.formulario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Entity(name = "form")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(length = 11)
    private String cpf;

    @Column(name = "\"user\"")
    private String user;

    @Column
    private String password;
}
