package cx.by.ApiCase.repo;

import cx.by.ApiCase.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepo extends JpaRepository<Link,Integer> {
}
