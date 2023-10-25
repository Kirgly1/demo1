package com.example.demo.AbstractClasses;

import com.example.demo.DTO.DTOTables.ModelsDTO;
import com.example.demo.Repositories.ModelsRepository;
import com.example.demo.Services.ModelsService;
import com.example.demo.Tables.Models;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public abstract class ModelsServiceImpl implements ModelsService {

    @Autowired
    ModelsRepository modelsRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ModelsDTO create(ModelsDTO modelsDTO) {
        Models s = modelMapper.map(modelsDTO, Models.class);
        return modelMapper.map(modelsRepository.save(s), ModelsDTO.class);
    }

    @Override
    public void destroy(ModelsDTO modelsDTO) {
        modelsRepository.deleteById(modelsDTO.getId());
    }

    @Override
    public void destroyById(UUID id) {
        modelsRepository.deleteById(id);
    }

    @Override
    public Optional<ModelsDTO> find(UUID id) {
        return Optional.ofNullable(modelMapper.map(modelsRepository.findById(id), ModelsDTO.class));
    }

    @Override
    public List<ModelsDTO> getAll() {
        return modelsRepository.findAll().stream().map((s) -> modelMapper.map(s, ModelsDTO.class)).collect(Collectors.toList());
    }
}
