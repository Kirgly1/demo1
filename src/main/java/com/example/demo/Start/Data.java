package com.example.demo.Start;
import com.example.demo.DTO.DTOTables.*;
import com.example.demo.Services.*;
import com.example.demo.constants.Category;
import com.example.demo.constants.Engine;
import com.example.demo.constants.Roles;
import com.example.demo.constants.Transmission;
import com.example.demo.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.Date;

@Component //создавать экземпляры Spring framework.
public class Data implements CommandLineRunner {// интерфейс `CommandLineRunner`

    @Autowired
    private final RolesService rolesService;
    @Autowired
    private final ModelsService modelsService;
    @Autowired
    private final UsersService userService;
    @Autowired
    private final BrandService brandService;
    @Autowired
    private final OffersService  offersService;
    //подключаемые зависимости
    @Autowired
    public Data(
            RolesService RolesService,
            ModelsService modelsService,
            UsersService userService,
            BrandService brandService,
            OffersService offersService
    ) {
        this.rolesService = RolesService;
        this.modelsService = modelsService;
        this.userService = userService;
        this.brandService = brandService;
        this.offersService = offersService;
    }


    @Override
    public void run(String... args) throws Exception {//заполнения базы данных исходными данными
        seedData();
    }


    private void seedData() throws IOException {//Метод `seedData` создает и сохраняет экземпляры различных классов DTO

        RolesDTO role = new RolesDTO(Roles.Admin);
        role = rolesService.create(role);

        UsersDTO user = new UsersDTO(
                "OlegTheBoss",
                "qwerty",
                "Oleg",
                "Sokolov",
                true,
                "https://source.unsplash.com/random/200x200?sig=1",
                new Date(),
                new Date(),
                role
        );
        user = userService.create(user);


        BrandDTO brand = new BrandDTO(
                "Chevrolet",
                new Date(),
                new Date()
        );
        brand = (BrandDTO) brandService.create(brand);

        ModelsDTO model = new ModelsDTO(
                "Orlando",
                Category.Motorcycle,
                "https://source.unsplash.com/random/200x200?sig=1",
                2010,
                2011,
                new Date(),
                new Date(),
                brand
        );
        model = modelsService.create(model);

        OffersDTO offer = new OffersDTO(
                "fast",
                Engine.Gasoline,
                "https://source.unsplash.com/random/200x200?sig=1",
                100,
                25000,
                Transmission.Automatic,
                2010,
                new Date(),
                new Date(),
                model,
                user
        );

        System.out.println(offer);
        System.out.println(offersService.create(offer));

//        userService.destroy(user);

    }
}
