package com.example.tpfoyer.Repository;

import com.example.tpfoyer.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
