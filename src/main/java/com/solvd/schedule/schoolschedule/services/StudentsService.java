package com.solvd.schedule.schoolschedule.services;

import com.solvd.schedule.schoolschedule.models.Students;
import com.solvd.schedule.schoolschedule.repositorys.IStudentsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class StudentsService {

    private IStudentsRepository iStudentsRepository;

    public StudentsService(IStudentsRepository iStudentsRepository) {
        this.iStudentsRepository = iStudentsRepository;
    }

    @Transactional
    public Students saveStudents(Students students) {
        return iStudentsRepository.save(students);
    }

    public Students getStudents(long id) {
        Optional<Students> students = iStudentsRepository.findById(id);
        if (students.isEmpty()) return null;
        return students.get();
    }

    @Transactional
    public Students updateStudents(Students students) {
        return iStudentsRepository.save(students);
    }

    @Transactional
    public void deleteStudents(long id) {
        iStudentsRepository.deleteById(id);
    }
}
