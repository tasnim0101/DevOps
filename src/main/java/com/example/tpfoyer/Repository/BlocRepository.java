package com.example.tpfoyer.Repository;

import com.example.tpfoyer.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long /* long est l' upper class de notre id*/> {
}
