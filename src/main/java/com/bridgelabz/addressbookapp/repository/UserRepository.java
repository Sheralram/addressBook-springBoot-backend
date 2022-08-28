package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public UserEntity findByEmailId(String email);
}
