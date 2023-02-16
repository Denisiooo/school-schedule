package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Classrooms;
import com.solvd.schedule.schoolschedule.services.ClassroomService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassroomRepository extends CrudRepository<Classrooms,Long> {
}
