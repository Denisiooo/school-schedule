package com.solvd.schedule.schoolschedule.service;

import com.solvd.schedule.schoolschedule.models.Lessons;
import com.solvd.schedule.schoolschedule.repositorys.ILessonsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class LessonService {

    private ILessonsRepository iLessonsRepository;

    public LessonService(ILessonsRepository iLessonsRepository) {
        this.iLessonsRepository = iLessonsRepository;
    }

    @Transactional
    public Lessons saveLessons(Lessons lessons) {
        return iLessonsRepository.save(lessons);
    }

    @Transactional
    public Lessons getLessons(long id) {
        Optional<Lessons> lessons = iLessonsRepository.findById(id);
        if (lessons.isEmpty()) return null;
        return lessons.get();
    }

    @Transactional
    public Lessons updateLessons(Lessons lessons) {
        return iLessonsRepository.save(lessons);
    }

    @Transactional
    public void deleteLessons(long id) {
        iLessonsRepository.deleteById(id);
    }
}
