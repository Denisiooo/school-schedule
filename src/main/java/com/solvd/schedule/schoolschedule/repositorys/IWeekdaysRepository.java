package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Weekdays;
import org.springframework.data.repository.CrudRepository;

public interface IWeekdaysRepository extends CrudRepository<Weekdays,Long> {
}
