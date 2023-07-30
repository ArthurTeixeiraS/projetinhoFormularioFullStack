package com.api.formulario.controller;

import com.api.formulario.dtos.request.FormRequestDTO;
import com.api.formulario.dtos.response.FormResponseDTO;
import com.api.formulario.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/formulario")
public class FormController {

    private final FormService formService;

    @PostMapping("/salvar")
    ResponseEntity<FormResponseDTO> save(@RequestBody FormRequestDTO entity){
        return ResponseEntity.ok(formService.save(entity));
    }

    @GetMapping("/mostrar-tudo")
    ResponseEntity<List<FormResponseDTO>> findAll(){
        return ResponseEntity.ok(formService.findAll());
    }
}
