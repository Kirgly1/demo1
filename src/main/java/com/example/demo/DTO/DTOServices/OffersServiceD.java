package com.example.demo.DTO.DTOServices;

import com.example.demo.DTO.DTOTables.OffersDTO;
import com.example.demo.Repositories.OffersRepository;
import com.example.demo.Tables.Offers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersServiceD {
    private OffersRepository offersRepository;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public OffersServiceD(OffersRepository offersRepository){
        this.offersRepository = offersRepository;
        this.modelMapper = new ModelMapper();
    }
    public OffersDTO getOffersById(long id){
        Offers offers = offersRepository.findById(id).orElse(null);
        if(offers == null){
            return null;
        }
        return modelMapper.map(offers, OffersDTO.class);
    }
    public OffersDTO createOffers(OffersDTO offersDTO){
        Offers offers = modelMapper.map(offersDTO, Offers.class);
        Offers savedOffers = offersRepository.save(offers);
        return modelMapper.map(savedOffers, OffersDTO.class);
    }
}
