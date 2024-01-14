package uniplovdiv.webserverapps.travelagencyapi.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationRepository, Long> {
}
