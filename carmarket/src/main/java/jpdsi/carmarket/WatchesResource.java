package jpdsi.carmarket;

import jpdsi.carmarket.model.Watches;
import jpdsi.carmarket.repo.WatchesRepo;
import jpdsi.carmarket.service.WatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watches")
public class WatchesResource {

    private WatchesService watchesService;

    public WatchesResource(WatchesService watchesService) {
        this.watchesService = watchesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Watches>> getAllWatches(){
        List<Watches> watches = watchesService.findAllWatches();
        return new ResponseEntity<>(watches, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Watches> addWatches(@RequestBody Watches watches) {
        Watches newWatches = watchesService.addWatches(watches);
        return new ResponseEntity<>(newWatches, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteWatches(@PathVariable("id") Long id){
        watchesService.deleteWatches(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Autowired
    WatchesRepo watchesRepo;

    @GetMapping("/all/{id}")
    public ResponseEntity<List<Watches>> getAllMyWatches(@PathVariable(value = "id")Long watchId){
        List<Watches> watches = watchesRepo.findByUserId(watchId);
        return new ResponseEntity<>(watches, HttpStatus.OK);
    }
}
