package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Etudiant;
import com.example.tpfoyer.Services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {


    IEtudiantService etudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant>getEtudiants(){
      return  etudiantService.getAllEtudiant();

    }
    /*@GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant getEtudiantById(@PathVariable("etudiant-id")Long idEtudiant)

    return etudiant*/

    // http://localhost:8089/tpfoyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant getEtudiantById(@PathVariable("etudiant-id") Long chId) {
        return etudiantService.getEtudiantById(chId);
    }
    // http://localhost:8089/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
      return etudiantService.addEtudiant(e);

    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void deleteEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.deleteEtudiant(etudiantId);
    }
    // http://localhost:8089/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
       return etudiantService.updateEtudiant(e);

    }
}
