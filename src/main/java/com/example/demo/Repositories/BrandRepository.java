package com.example.demo.Repositories;

import com.example.demo.Tables.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
@EnableJpaRepositories(basePackages = "com.example.demo.Repositories")
public interface BrandRepository extends JpaRepository<Brand, Long> {

    List<Brand> countBrandByModified(Date modified);

    void deleteById(UUID id);

    Object findById(UUID id);
}
