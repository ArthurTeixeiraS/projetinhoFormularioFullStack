package com.api.formulario.service.impl;

import com.api.formulario.dtos.request.FormRequestDTO;
import com.api.formulario.dtos.response.FormResponseDTO;
import com.api.formulario.entity.Form;
import com.api.formulario.repository.FormRepository;
import com.api.formulario.service.FormService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FormServiceImpl implements FormService {

    private final FormRepository formRepository;

    @Override
    public FormResponseDTO save(FormRequestDTO entity) {

        Form entityToPersist = Form.builder()
                .name(entity.getName())
                .lastName(entity.getLastName())
                .cpf(entity.getCpf())
                .password(entity.getPassword())
                .user(entity.getUser())
                .build();
        Form entityPersisted = formRepository.save(entityToPersist);

        return FormResponseDTO.builder()
                .name(entityPersisted.getName())
                .lastName(entityPersisted.getLastName())
                .cpf(entityPersisted.getCpf())
                .password(entityPersisted.getPassword())
                .user(entityPersisted.getUser())
                .build();
    }

    @Override
    public List<FormResponseDTO> findAll() {

        List<Form> forms = formRepository.findAll();

        return forms.stream().map(form -> FormResponseDTO.builder()
                .name(form.getName())
                .lastName(form.getLastName())
                .cpf(form.getCpf())
                .password(form.getPassword())
                .user(form.getUser())
                .build()
        ).toList();
    }
}
