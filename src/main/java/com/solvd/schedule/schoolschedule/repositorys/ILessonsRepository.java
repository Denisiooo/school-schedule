package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Lessons;
import org.springframework.data.repository.CrudRepository;

public interface ILessonsRepository extends CrudRepository<Lessons,Long> {
}
