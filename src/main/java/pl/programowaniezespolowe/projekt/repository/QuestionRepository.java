package pl.programowaniezespolowe.projekt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.programowaniezespolowe.projekt.model.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
}