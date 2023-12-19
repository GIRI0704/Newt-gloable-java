package com.example.Course.Repository;

import com.example.Course.Entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepo extends JpaRepository<Passport,Integer> {
}
