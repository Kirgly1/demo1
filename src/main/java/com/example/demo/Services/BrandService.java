package com.example.demo.Services;

import com.example.demo.DTO.DTOTables.BrandDTO;
import com.example.demo.Tables.Brand;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Controller
public interface BrandService {

    BrandDTO create(BrandDTO t);

    void destroy(BrandDTO t);

    void destroyById(UUID id);


    Optional<BrandDTO> find (UUID id);

    List<BrandDTO> getAll();
}
