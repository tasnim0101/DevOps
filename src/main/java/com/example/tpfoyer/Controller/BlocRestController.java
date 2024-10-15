package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc>getBlocs(){
        List<Bloc> listBloc=blocService.getAllBloc();
        return listBloc;
    }
    /*@GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc getBlocById(@PathVariable("bloc-id")Long idBloc)
    Bloc bloc=blocService.getBlocById(idBloc);
    return bloc*/

    // http://localhost:8089/tpfoyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc getBlocById(@PathVariable("bloc-id") Long chId) {
        Bloc bloc = blocService.getBlocById(chId);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void deleteBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.deleteBloc(blocId);
    }
    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.updateBloc(b);
        return bloc;
    }
}
