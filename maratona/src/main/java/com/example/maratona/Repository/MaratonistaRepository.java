package com.example.maratona.Repository;


import com.example.maratona.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonistaRepository extends JpaRepository<Maratonista, Long> {
}
