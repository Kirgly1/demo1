package com.example.demo.Repositories;

import com.example.demo.Tables.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@EnableJpaRepositories(basePackages = "com.example.demo.Repositories")
public interface ModelsRepository extends JpaRepository<Models, Long> {
    List<Models> findAllByStartYear(int startYear);
    List<Models> countAllByEndYearAndName(int endYear, String name);
    List<Models> deleteAllByCategory(int category);

    void deleteById(UUID id);

    Object findById(UUID id);
}
