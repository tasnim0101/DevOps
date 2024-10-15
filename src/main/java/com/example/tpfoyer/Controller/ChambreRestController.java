package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Chambre;
import com.example.tpfoyer.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    IChambreService chambreService;
    @GetMapping("/retrieve-all-chambers")
    public List<Chambre>getChambres(){
        List<Chambre> listChambre=chambreService.getAllChambre();
        return listChambre;
    }
    /*@GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre getChambreById(@PathVariable("chambre-id")Long idChambre)
    Chambre chambre=chambreService.getChambreById(idChambre);
    return chambre*/

    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre getChambreById(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.getChambreById(chId);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void deleteChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.deleteChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }
}
