package com.solvd.schedule.schoolschedule.service;

import com.solvd.schedule.schoolschedule.models.Subjects;
import com.solvd.schedule.schoolschedule.repositorys.ISubjectsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SubjectService {

    private ISubjectsRepository iSubjectsRepository;

    public SubjectService(ISubjectsRepository iSubjectsRepository) {
        this.iSubjectsRepository = iSubjectsRepository;
    }

    @Transactional
    public Subjects saveSubjects(Subjects subjects) {
        return iSubjectsRepository.save(subjects);
    }

    @Transactional
    public Subjects getSubjects(long id) {
        Optional<Subjects> subjects = iSubjectsRepository.findById(id);
        if (subjects.isEmpty()) return null;
        return subjects.get();
    }

    @Transactional
    public Subjects updateSubjects(Subjects subjects) {
        return iSubjectsRepository.save(subjects);
    }

    @Transactional
    public void deleteSubjects(long id) {
        iSubjectsRepository.deleteById(id);
    }
}
