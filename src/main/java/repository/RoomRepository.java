package repository;

import model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface RoomRepository extends PagingAndSortingRepository<Long, Room> {
}
