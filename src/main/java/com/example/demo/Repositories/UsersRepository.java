package com.example.demo.Repositories;

import com.example.demo.Tables.Users;
import jdk.jfr.Enabled;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@EnableJpaRepositories(basePackages = "com.example.demo.Repositories")
public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findAllByFirstName(String firstName);
    List<Users> existsByIsActive(boolean isActive);
    List<Users> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<Users> deleteByRole(int role);
    List<Users> getByImageUrl(String imageUrl);

    void deleteById(UUID id);

    Object findById(UUID id);
}
