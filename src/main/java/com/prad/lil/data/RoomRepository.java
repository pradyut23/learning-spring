package com.prad.lil.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //Annotation to tell that this is a data repository
public interface RoomRepository extends CrudRepository<Room, Long> { //CrudRepository takes Entity and class type of id
}
