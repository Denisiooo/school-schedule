package com.solvd.schedule.schoolschedule.repositorys;

import org.springframework.data.repository.CrudRepository;
import com.solvd.schedule.schoolschedule.models.Classrooms;

public interface IClassroomRepository extends CrudRepository<Classrooms,Long> {
}
