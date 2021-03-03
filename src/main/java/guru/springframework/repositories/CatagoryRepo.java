package guru.springframework.repositories;

import guru.springframework.domain.Catagory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CatagoryRepo extends CrudRepository<Catagory, Long> {

    Optional<Catagory> findByDescription(String description);
}
