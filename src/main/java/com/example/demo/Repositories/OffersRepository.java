package com.example.demo.Repositories;

import com.example.demo.Tables.Offers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("ALL")
@EnableJpaRepositories(basePackages = "com.example.demo.Repositories")
@Repository


public interface OffersRepository extends JpaRepository<Offers, Long> {

    List<Offers> findAllByEngine(int engine);
    List<Offers> findAllByMileage(int mileage);
    List<Offers> deleteAllByYear(int year);

    void deleteById(UUID id);

    public Object findById(UUID id);
}
