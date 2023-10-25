package com.example.demo.DTO.DTOServices;

import com.example.demo.DTO.DTOTables.BrandDTO;
import com.example.demo.Repositories.BrandRepository;
import com.example.demo.Tables.Brand;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceD {
    private final BrandRepository brandRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public BrandRepository getBrandRepository() {
        return brandRepository;
    }

    @Autowired
    public BrandServiceD(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
        this.modelMapper = new ModelMapper();
    }


    public BrandDTO getBrandById(long id){
        Brand brand = brandRepository.findById(id).orElse(null);
        if (brand == null){
            return null;
        }
        return modelMapper.map(brand, BrandDTO.class);
    }
    public BrandDTO createBrand(BrandDTO brandDTO){
        Brand brand = modelMapper.map(brandDTO, Brand.class);
        Brand savedBrand = brandRepository.save(brand);
        return modelMapper.map(savedBrand, BrandDTO.class);
    }
}
