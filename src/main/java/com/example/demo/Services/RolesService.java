package com.example.demo.Services;

import com.example.demo.DTO.DTOTables.RolesDTO;
import com.example.demo.Tables.Roles;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public interface RolesService {

    void destroy(RolesDTO t);

  RolesDTO create(RolesDTO t);

    void destroyById(UUID id);

    Optional<RolesDTO> find(UUID id);

    List<RolesDTO> getAll();


}
