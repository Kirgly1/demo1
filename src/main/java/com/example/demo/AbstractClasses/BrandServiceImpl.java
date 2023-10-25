package com.example.demo.AbstractClasses;

import com.example.demo.DTO.DTOTables.BrandDTO;
import com.example.demo.Repositories.BrandRepository;
import com.example.demo.Tables.Brand;
import com.example.demo.Services.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
@Service
public abstract class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public BrandDTO create(BrandDTO brandDto) {
        Brand s = modelMapper.map(brandDto, Brand.class);
        return modelMapper.map(brandRepository.save(s), BrandDTO.class);
    }

    @Override
    public void destroy(BrandDTO brandDto) {
        brandRepository.deleteById(BrandDTO.id(UUID.randomUUID()));
    }

    @Override
    public void destroyById(UUID id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Optional<BrandDTO> find(UUID id) {
        return Optional.ofNullable(modelMapper.map(brandRepository.findById(id), BrandDTO.class));
    }

    @Override
    public List<BrandDTO> getAll() {
        return brandRepository.findAll().stream().map((s) -> modelMapper.map(s, BrandDTO.class)).collect(Collectors.toList());
    }
}