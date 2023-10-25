package com.example.demo.AbstractClasses;

import com.example.demo.DTO.DTOTables.RolesDTO;
import com.example.demo.Repositories.RolesRepository;
import com.example.demo.Services.RolesService;
import com.example.demo.Tables.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public abstract class RolesServiceImpl implements RolesService {
    @Autowired
    RolesRepository rolesRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public RolesDTO create(RolesDTO rolesDTO) {
        Roles s = modelMapper.map(rolesDTO, Roles.class);
        return modelMapper.map(rolesRepository.save(s), RolesDTO.class);
    }

    @Override
    public void destroy(RolesDTO rolesDTO) {
        rolesRepository.deleteById(RolesDTO.id(UUID.randomUUID()));
    }

    @Override
    public void destroyById(UUID id) {
        rolesRepository.deleteById(id);
    }

    @Override
    public Optional<RolesDTO> find (UUID id) {
        return Optional.ofNullable(modelMapper.map(rolesRepository.findById(id), RolesDTO.class));
    }

    @Override
    public List<RolesDTO> getAll() {
        return rolesRepository.findAll().stream().map((s) -> modelMapper.map(s, RolesDTO.class)).collect(Collectors.toList());
    }
}
