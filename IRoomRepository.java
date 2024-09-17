package com.ht.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ht.entity.Room;

public interface IRoomRepository extends JpaRepository<Room, Integer> {

}
