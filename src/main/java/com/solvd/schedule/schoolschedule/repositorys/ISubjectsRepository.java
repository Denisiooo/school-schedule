package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Subjects;
import org.springframework.data.repository.CrudRepository;

public interface ISubjectsRepository extends CrudRepository<Subjects,Long> {
}
