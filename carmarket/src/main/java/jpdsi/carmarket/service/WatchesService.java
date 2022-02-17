package jpdsi.carmarket.service;

import jpdsi.carmarket.model.Watches;
import jpdsi.carmarket.repo.CarRepo;
import jpdsi.carmarket.repo.UserRepo;
import jpdsi.carmarket.repo.WatchesRepo;
import jpdsi.carmarket.seciurity.jwt.JwtUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchesService {

    private final WatchesRepo watchesRepo;
    private final UserRepo userRepo;
    private final CarRepo carRepo;
    private final JwtUtils jwtUtils;

    public WatchesService(WatchesRepo watchesRepo, UserRepo userRepo, CarRepo carRepo, JwtUtils jwtUtils) {
        this.watchesRepo = watchesRepo;
        this.userRepo = userRepo;
        this.carRepo = carRepo;
        this.jwtUtils = jwtUtils;
    }

    public List<Watches> findAllWatches(){
        return watchesRepo.findAll();
    }

    public Watches addWatches(Watches watches){
        return watchesRepo.save(watches);
    }

    public void deleteWatches(Long id){
        watchesRepo.deleteById(id);
    }

}
