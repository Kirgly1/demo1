package com.example.demo.DTO.DTOServices;

import com.example.demo.DTO.DTOTables.RolesDTO;
import com.example.demo.Repositories.OffersRepository;
import com.example.demo.Repositories.RolesRepository;
import com.example.demo.Services.OffersService;
import com.example.demo.Tables.Roles;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceD {
    private RolesRepository rolesRepository;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public RolesServiceD(RolesRepository rolesRepository){
        this.rolesRepository = rolesRepository;
        this.modelMapper = new ModelMapper();
    }
    public RolesDTO getRolesById(long id){
        Roles roles = rolesRepository.findById(id).orElse(null);
        if(roles == null){
            return null;
        }
        return modelMapper.map(roles, RolesDTO.class);
    }
    public RolesDTO createRoles(RolesDTO rolesDTO){
        Roles roles = modelMapper.map(rolesDTO, Roles.class);
        Roles savedRoles = rolesRepository.save(roles);
        return modelMapper.map(savedRoles,RolesDTO.class);
    }
}
