package cx.by.ApiCase.jpa.repo;

import cx.by.ApiCase.model.URI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URIRepository extends JpaRepository<URI,Integer> {
}
