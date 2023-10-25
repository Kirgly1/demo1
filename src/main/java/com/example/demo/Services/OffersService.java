package com.example.demo.Services;

import com.example.demo.DTO.DTOTables.OffersDTO;
import com.example.demo.Tables.Offers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public interface OffersService {
    OffersDTO create(OffersDTO t);

    void destroy(OffersDTO t);

    void destroyById(UUID id);

    Optional<OffersDTO> find(UUID id);

    List<OffersDTO> getAll();
}
