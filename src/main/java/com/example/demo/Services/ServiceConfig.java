package com.example.demo.Services;

import com.example.demo.DTO.DTOTables.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Configuration
public class ServiceConfig {
    @Bean(name = "rolesService")
    public RolesService rolesService() {
        return new RolesService() {
            @Override
            public void destroy(RolesDTO t) {

            }

            @Override
            public RolesDTO create(RolesDTO t) {
                return null;
            }

            @Override
            public void destroyById(UUID id) {

            }

            @Override
            public Optional<RolesDTO> find(UUID id) {
                return Optional.empty();
            }

            @Override
            public List<RolesDTO> getAll() {
                return null;
            }
        };
    }
    @Bean(name = "modelsService")
    public ModelsService modelsService(){
        return new ModelsService() {
            @Override
            public ModelsDTO create(ModelsDTO t) {
                return null;
            }

            @Override
            public void destroy(ModelsDTO t) {

            }

            @Override
            public void destroyById(UUID id) {

            }

            @Override
            public Optional<ModelsDTO> find(UUID id) {
                return Optional.empty();
            }

            @Override
            public List<ModelsDTO> getAll() {
                return null;
            }
        };
    }
    @Bean(name = "brandService")
    public BrandService brandService(){
        return new BrandService() {
            @Override
            public BrandDTO create(BrandDTO t) {
                return null;
            }

            @Override
            public void destroy(BrandDTO t) {

            }

            @Override
            public void destroyById(UUID id) {

            }

            @Override
            public Optional<BrandDTO> find(UUID id) {
                return Optional.empty();
            }

            @Override
            public List<BrandDTO> getAll() {
                return null;
            }
        };
    }
    @Bean(name = "usersService")
    public UsersService usersService(){
        return new UsersService() {
            @Override
            public UsersDTO create(UsersDTO t) {
                return null;
            }

            @Override
            public void destroy(UsersDTO t) {

            }

            @Override
            public void destroyById(UUID id) {

            }

            @Override
            public Optional<UsersDTO> find(UUID id) {
                return Optional.empty();
            }

            @Override
            public List<UsersDTO> getAll() {
                return null;
            }
        };
    }
    @Bean(name = "offersService")
    public OffersService offersService(){
        return new OffersService() {
            @Override
            public OffersDTO create(OffersDTO t) {
                return null;
            }

            @Override
            public void destroy(OffersDTO t) {

            }

            @Override
            public void destroyById(UUID id) {

            }

            @Override
            public Optional<OffersDTO> find(UUID id) {
                return Optional.empty();
            }

            @Override
            public List<OffersDTO> getAll() {
                return null;
            }
        };
    }
}
