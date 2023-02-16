package com.solvd.schedule.schoolschedule.services;

import com.solvd.schedule.schoolschedule.models.Schedules;
import com.solvd.schedule.schoolschedule.repositorys.ISchedulesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SchedulesService {

    private ISchedulesRepository iSchedulesRepository;

    public SchedulesService(ISchedulesRepository iSchedulesRepository) {
        this.iSchedulesRepository = iSchedulesRepository;
    }

    @Transactional
    public Schedules saveSchedules(Schedules schedules) {
        return iSchedulesRepository.save(schedules);
    }

    @Transactional
    public Schedules getSchedules(long id) {
        Optional<Schedules> schedules = iSchedulesRepository.findById(id);
        if (schedules.isEmpty()) return null;
        return schedules.get();
    }

    @Transactional
    public Schedules updateSchedules(Schedules schedules) {
        return iSchedulesRepository.save(schedules);
    }

    @Transactional
    public void deleteSchedules(long id) {
        iSchedulesRepository.deleteById(id);
    }
}
