package com.example.demo.exe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.exe.entity.Adress;
@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

}
