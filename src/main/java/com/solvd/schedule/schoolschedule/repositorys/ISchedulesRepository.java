package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Schedules;
import org.springframework.data.repository.CrudRepository;

public interface ISchedulesRepository extends CrudRepository<Schedules,Long> {
}
