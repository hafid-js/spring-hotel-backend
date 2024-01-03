package com.hafidtech.springhotel.repository;

import com.hafidtech.springhotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
