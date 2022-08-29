package magicofspring.jdbctojpa.springjpa;

import magicofspring.jdbctojpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
