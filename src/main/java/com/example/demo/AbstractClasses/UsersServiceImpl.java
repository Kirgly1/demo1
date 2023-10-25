package com.example.demo.AbstractClasses;

import com.example.demo.DTO.DTOTables.UsersDTO;
import com.example.demo.Repositories.UsersRepository;
import com.example.demo.Services.UsersService;
import com.example.demo.Tables.Users;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UsersDTO create(UsersDTO usersDTO) {
        Users s = modelMapper.map(usersDTO, Users.class);
        return modelMapper.map(usersRepository.save(s), UsersDTO.class);
    }

    @Override
    public void destroy(UsersDTO usersDTO) {
        usersRepository.deleteById(Users.id(UUID.randomUUID()));
    }

    @Override
    public void destroyById(UUID id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Optional<UsersDTO> find(UUID id) {
        return Optional.ofNullable(modelMapper.map(usersRepository.findById(id), UsersDTO.class));
    }

    @Override
    public List<UsersDTO> getAll() {
        return usersRepository.findAll().stream().map((s) -> modelMapper.map(s, UsersDTO.class)).collect(Collectors.toList());
    }
}
