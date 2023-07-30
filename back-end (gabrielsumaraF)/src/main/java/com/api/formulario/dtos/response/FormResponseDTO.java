package com.api.formulario.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FormResponseDTO {

    private String name;

    private String lastName;

    private String cpf;

    private String user;

    private String password;
}
