package com.example.demo.Services;

import com.example.demo.DTO.DTOTables.ModelsDTO;
import com.example.demo.Tables.Models;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public interface ModelsService {
    ModelsDTO create(ModelsDTO t);

    void destroy(ModelsDTO t);

    void destroyById(UUID id);

    Optional<ModelsDTO> find(UUID id);

    List<ModelsDTO> getAll();


}
