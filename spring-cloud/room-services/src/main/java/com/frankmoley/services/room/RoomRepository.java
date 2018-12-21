package com.frankmoley.services.room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ahmed.
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    Room findByRoomNumber(String roomNumber);
}
