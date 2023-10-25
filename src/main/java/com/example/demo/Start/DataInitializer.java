package com.example.demo.Start;

import com.example.demo.Repositories.*;
import com.example.demo.Tables.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;


@Component
public class DataInitializer {
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private ModelsRepository modelsRepository;
    @Autowired
    private OffersRepository offersRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private UsersRepository usersRepository;


    public DataInitializer(){

    }
    public DataInitializer(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }
    public DataInitializer(ModelsRepository modelsRepository){
        this.modelsRepository = modelsRepository;
    }
    public DataInitializer(OffersRepository offersRepository){
        this.offersRepository = offersRepository;
    }
    public DataInitializer(RolesRepository rolesRepository){
        this.rolesRepository = rolesRepository;
    }
    public DataInitializer(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    @PostConstruct
    public void init(){
        Brand brand = new Brand();
        brand.setId(UUID.randomUUID());
        brand.setName("John");
        brand.setCreated(new Date());
        brand.setModified(new Date());
        brandRepository.save(brand);

        Models models = new Models();
        models.setId(UUID.randomUUID());
        models.setName("Kamaz");
        models.setCategory(3);
        models.setImaggeUrl("");
        models.setStartYear(2015);
        models.setEndYear(2023);
        models.setModified(21);
        models.setBrand_id(1454);
        modelsRepository.save(models);

        Offers offers = new Offers();
        offers.setId(UUID.randomUUID());
        offers.setDescription("Big Truck");
        offers.setEngine(80);
        offers.setImageUrl("");
        offers.setMileage(526_956);
        offers.setModified(2015);
        offers.setPrice(4_634_231);
        offers.setTransmission(60);
        offers.setYear(2015);
        offers.setModel_id(823);
        offers.setSeller_id(9182);
        offersRepository.save(offers);

        Roles roles = new Roles();
        roles.setId(UUID.randomUUID());
        roles.setRole(31);
        rolesRepository.save(roles);

        Users users = new Users();
        users.setId(UUID.randomUUID());
        users.setPassword("qwklje538947");
        users.setFirstName("Oleg");
        users.setLastName("Kuvalda");
        users.setActive(users.isActive());
        users.setImageUrl("");
        users.setRole(183);
        usersRepository.save(users);

    }
}
