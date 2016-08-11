package sample.test.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneObjectRepository extends CrudRepository<OneObject, Long> {

}
