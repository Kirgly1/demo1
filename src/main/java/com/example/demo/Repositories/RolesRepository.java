package com.example.demo.Repositories;

import com.example.demo.Tables.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("ALL")
@Repository
@EnableJpaRepositories(basePackages = "com.example.demo.Repositories")

public interface RolesRepository extends JpaRepository<Roles, Long> {
    List <Roles> findAllByRole(int role);
    List <Roles> deleteByRole(int role);

    void deleteById(UUID id);

    public Object findById(UUID id);
}
