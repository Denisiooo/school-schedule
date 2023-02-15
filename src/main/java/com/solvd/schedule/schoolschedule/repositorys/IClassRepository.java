package com.solvd.schedule.schoolschedule.repositorys;

import com.solvd.schedule.schoolschedule.models.Classes;
import org.springframework.data.repository.CrudRepository;

public interface IClassRepository extends CrudRepository<Classes,Long> {
}
