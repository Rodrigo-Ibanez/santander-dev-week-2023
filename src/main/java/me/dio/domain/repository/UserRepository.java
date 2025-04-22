package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import me.dio.domain.model.User;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);

    
    List<User> findByNameContainingIgnoreCase(String name);

    
    Optional<User> findByAccountNumber(String number);

    
    Optional<User> findByCardNumber(String number);

   
    @Query("SELECT u FROM User u JOIN u.features f WHERE f.name = :featureName")
    List<User> findByFeatureName(@Param("featureName") String featureName);

    
    @Query("SELECT u FROM User u JOIN u.news n WHERE n.title = :newsTitle")
    List<User> findByNewsTitle(@Param("newsTitle") String newsTitle);
}

