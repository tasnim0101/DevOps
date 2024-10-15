package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Etudiant;
import com.example.tpfoyer.Entities.Projet;
import com.example.tpfoyer.Services.IProjetService;
import com.example.tpfoyer.Services.ProjetServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ProjetRestController {
  IProjetService projetService;

    @PostMapping("/ajouter")
    public Projet addProjetAndProjetDeatil(@RequestBody Projet projet) {
        return projetService.addProjetAndProjetDeatil(projet);
    }
}