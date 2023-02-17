package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Classrooms;
import org.springframework.data.repository.CrudRepository;

public interface IClassroomRepository extends CrudRepository<Classrooms,Long> {
}
