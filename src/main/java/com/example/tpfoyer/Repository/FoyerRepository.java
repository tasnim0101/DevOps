package com.example.tpfoyer.Repository;

import com.example.tpfoyer.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
