package repository;

import model.CustomerLevel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerLevelRepository extends PagingAndSortingRepository<Long, CustomerLevel> {
}
