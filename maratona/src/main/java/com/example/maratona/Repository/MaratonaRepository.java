package com.example.maratona.Repository;


import com.example.maratona.Entity.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonaRepository extends JpaRepository<Maratona, Long> {

}

