package com.solvd.schedule.schoolschedule.services;

import com.solvd.schedule.schoolschedule.models.Weekdays;
import com.solvd.schedule.schoolschedule.repositorys.IWeekdaysRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class WeekdaysService {

    private IWeekdaysRepository iWeekdaysRepository;

    public WeekdaysService(IWeekdaysRepository iWeekdaysRepository) {
        this.iWeekdaysRepository = iWeekdaysRepository;
    }

    @Transactional
    public Weekdays saveWeekdays(Weekdays weekdays) {
        return iWeekdaysRepository.save(weekdays);
    }

    public Weekdays getWeekdays(long id) {
        Optional<Weekdays> weekdays = iWeekdaysRepository.findById(id);
        if (weekdays.isEmpty()) return null;
        return weekdays.get();
    }

    @Transactional
    public Weekdays updateWeekdays(Weekdays weekdays) {
        return iWeekdaysRepository.save(weekdays);
    }

    @Transactional
    public void deleteWeekdays(long id) {
        iWeekdaysRepository.deleteById(id);
    }
}
