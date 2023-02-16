package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Teachers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeachersRepository extends CrudRepository<Teachers,Long> {
}
