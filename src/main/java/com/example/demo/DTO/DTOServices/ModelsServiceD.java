package com.example.demo.DTO.DTOServices;

import com.example.demo.DTO.DTOTables.ModelsDTO;
import com.example.demo.Repositories.ModelsRepository;
import com.example.demo.Tables.Models;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelsServiceD {
    private ModelsRepository modelsRepository;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public ModelsServiceD(ModelsRepository modelsRepository){
        this.modelsRepository = modelsRepository;
        this.modelMapper = new ModelMapper();
    }

    public ModelsDTO getModelsById(long id){
        Models models = modelsRepository.findById(id).orElse(null);
        if (models == null){
            return null;
        }
        return modelMapper.map(models, ModelsDTO.class);
    }
    public ModelsDTO createModels(ModelsDTO modelsDTO){
        Models models = modelMapper.map(modelsDTO, Models.class);
        Models savedModels = modelsRepository.save(models);
        return modelMapper.map(savedModels, ModelsDTO.class);
    }

}
