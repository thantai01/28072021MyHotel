package repository;

import model.RoomType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomTypeRepository extends PagingAndSortingRepository<Long, RoomType> {
}
