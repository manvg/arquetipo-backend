package __packageInPathFormat__.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository<T, ID> extends JpaRepository<T, ID> {
    
}
