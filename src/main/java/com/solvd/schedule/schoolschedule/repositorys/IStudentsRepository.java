package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Students;
import org.springframework.data.repository.CrudRepository;

public interface IStudentsRepository extends CrudRepository<Students,Long> {
}
