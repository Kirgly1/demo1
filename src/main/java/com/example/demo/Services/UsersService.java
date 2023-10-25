package com.example.demo.Services;

import com.example.demo.DTO.DTOTables.UsersDTO;
import com.example.demo.Tables.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public interface UsersService {

    UsersDTO create(UsersDTO t);

    void destroy(UsersDTO t);

    void destroyById(UUID id);

    Optional<UsersDTO> find(UUID id);

    List<UsersDTO> getAll();
}
