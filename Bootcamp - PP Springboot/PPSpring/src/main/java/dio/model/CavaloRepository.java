package dio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CavaloRepository extends CrudRepository<Cavalo, Long>{
    
}
