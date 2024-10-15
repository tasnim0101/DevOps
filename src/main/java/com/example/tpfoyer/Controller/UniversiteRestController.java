package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Universite;
import com.example.tpfoyer.Services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteService universiteService;
    @GetMapping("/retrieve-all-universites")
    public List<Universite>getUniversites(){
        List<Universite> listUniversite=universiteService.getAllUniversite();
        return listUniversite;
    }
    /*@GetMapping("/retrieve-universite/{universite-id}")
    public Universite getUniversiteById(@PathVariable("universite-id")Long idUniversite)
    Universite universite=universiteService.getUniversiteById(idUniversite);
    return universite*/

    // http://localhost:8089/tpuniversite/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite getUniversiteById(@PathVariable("universite-id") Long univId) {
        Universite universite = universiteService.getUniversiteById(univId);
        return universite;
    }
    // http://localhost:8089/tpuniversite/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUnivsersite(u);
        return universite;
    }
    // http://localhost:8089/tpuniversite/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void deleteUniversite(@PathVariable("universite-id") Long univId) {
        universiteService.deleteUniversite(univId);
    }
    // http://localhost:8089/tpuniversite/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateuniversite(u);
        return universite;
    }
}
