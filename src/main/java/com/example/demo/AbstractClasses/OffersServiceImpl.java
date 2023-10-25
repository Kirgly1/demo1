package com.example.demo.AbstractClasses;

import com.example.demo.DTO.DTOTables.OffersDTO;
import com.example.demo.Repositories.OffersRepository;
import com.example.demo.Services.OffersService;
import com.example.demo.Tables.Offers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public abstract class OffersServiceImpl implements OffersService {
    @Autowired
    OffersRepository offersRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public OffersDTO create(OffersDTO offersDTO) {
        Offers s = modelMapper.map(offersDTO, Offers.class);
        return modelMapper.map(offersRepository.save(s), OffersDTO.class);
    }

    @Override
    public void destroy(OffersDTO offersDTO) {
        offersRepository.deleteById(OffersDTO.id(UUID.randomUUID()));
    }

    @Override
    public void destroyById(UUID id) {
        offersRepository.deleteById(id);
    }

    @Override
    public Optional<OffersDTO> find(UUID id) {
        return Optional.ofNullable(modelMapper.map(offersRepository.findById(id), OffersDTO.class));
    }

    @Override
    public List<OffersDTO> getAll() {
        return offersRepository.findAll().stream().map((s) -> modelMapper.map(s, OffersDTO.class)).collect(Collectors.toList());
    }

}
