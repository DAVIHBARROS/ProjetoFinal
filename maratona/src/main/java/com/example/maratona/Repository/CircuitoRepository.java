package com.example.maratona.Repository;


import com.example.maratona.Entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long>{

}
