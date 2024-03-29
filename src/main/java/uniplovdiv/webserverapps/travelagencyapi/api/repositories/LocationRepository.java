package uniplovdiv.webserverapps.travelagencyapi.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uniplovdiv.webserverapps.travelagencyapi.api.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
