package jpdsi.carmarket.repo;

import jpdsi.carmarket.model.Watches;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WatchesRepo extends JpaRepository<Watches, Long> {

    List<Watches> findByUserId(Long postId);
}
