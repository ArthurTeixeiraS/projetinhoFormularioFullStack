package com.api.formulario.service;

import com.api.formulario.dtos.request.FormRequestDTO;
import com.api.formulario.dtos.response.FormResponseDTO;

import java.util.List;

public interface FormService {


    FormResponseDTO save(FormRequestDTO entity);

    List<FormResponseDTO> findAll();
}
