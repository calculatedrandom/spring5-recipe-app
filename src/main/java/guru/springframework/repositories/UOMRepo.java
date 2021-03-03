package guru.springframework.repositories;

import guru.springframework.domain.UOM;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UOMRepo extends CrudRepository<UOM, Long> {

    Optional<UOM> findByDescription(String description);
}
