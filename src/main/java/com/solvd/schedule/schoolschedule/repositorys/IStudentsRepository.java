package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentsRepository extends CrudRepository<Students,Long> {
}
