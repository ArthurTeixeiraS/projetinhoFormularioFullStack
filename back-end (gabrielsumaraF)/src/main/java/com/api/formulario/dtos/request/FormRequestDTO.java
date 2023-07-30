package com.api.formulario.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FormRequestDTO {

    private String name;

    private String lastName;

    private String cpf;

    private String user;

    private String password;
}
