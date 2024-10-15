package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Foyer;
import com.example.tpfoyer.Services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    IFoyerService foyerService;
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer>getFoyers(){
        List<Foyer> listFoyer=foyerService.getAllFoyer();
        return listFoyer;
    }
    /*@GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer getFoyerById(@PathVariable("foyer-id")Long idFoyer)
    Foyer foyer=foyerService.getFoyerById(idFoyer);
    return foyer*/

    // http://localhost:8089/tpfoyer/foyer/retrieve-foyer/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer getFoyerById(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.getFoyerById(chId);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/foyer/add-foyer
  //  @PostMapping("/add-foyer")
   // public String addFoyer(@RequestBody HttpEntity httpEntity) {
       // String json = httpEntity.getBody();
        //Foyer foyer = foyerService.addFoyer(httpEntity);
        //return foyer;
        //return json;
   /* }
    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void deleteFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.deleteFoyer(foyerId);
    }
    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.updateFoyer(f);
        return foyer;
    }*/
}
