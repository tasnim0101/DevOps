package com.example.tpfoyer.Repository;

import com.example.tpfoyer.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
