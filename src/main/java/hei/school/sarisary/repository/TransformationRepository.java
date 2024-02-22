package hei.school.sarisary.repository;

import hei.school.sarisary.repository.model.Transformation;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransformationRepository extends CrudRepository<Transformation, String> {
  @Override
  Optional<Transformation> findById(String id);
}
