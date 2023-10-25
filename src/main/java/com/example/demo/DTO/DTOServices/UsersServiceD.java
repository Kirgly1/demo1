package com.example.demo.DTO.DTOServices;

import com.example.demo.DTO.DTOTables.UsersDTO;
import com.example.demo.Repositories.UsersRepository;
import com.example.demo.Tables.Users;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceD {
    private UsersRepository usersRepository;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public UsersServiceD(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
        this.modelMapper = new ModelMapper();

    }
    public UsersDTO getUsersById(long id){
        Users users = usersRepository.findById(id).orElse(null);
        if(users == null){
            return null;
        }
        return modelMapper.map(users, UsersDTO.class);
    }
    public UsersDTO createUsers(UsersDTO usersDTO){
        Users users = modelMapper.map(usersDTO, Users.class);
        Users savedUsers = usersRepository.save(users);
        return modelMapper.map(savedUsers, UsersDTO.class);
    }
}
