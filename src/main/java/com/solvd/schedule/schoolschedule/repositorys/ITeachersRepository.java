package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Teachers;
import org.springframework.data.repository.CrudRepository;

public interface ITeachersRepository extends CrudRepository<Teachers,Long> {
}
