package com.solvd.schedule.schoolschedule.services;

import com.solvd.schedule.schoolschedule.models.Teachers;
import com.solvd.schedule.schoolschedule.repositorys.ITeachersRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TeachersService {

    private ITeachersRepository iTeachersRepository;

    public TeachersService(ITeachersRepository iTeachersRepository) {
        this.iTeachersRepository = iTeachersRepository;
    }

    @Transactional
    public Teachers saveTeachers(Teachers teachers) {
        return iTeachersRepository.save(teachers);
    }

    @Transactional
    public Teachers getTeachers(long id) {
        Optional<Teachers> teachers = iTeachersRepository.findById(id);
        if (teachers.isEmpty()) return null;
        return teachers.get();
    }

    @Transactional
    public Teachers updateTeachers(Teachers teachers) {
        return iTeachersRepository.save(teachers);
    }

    @Transactional
    public void deleteTeachers(long id) {
        iTeachersRepository.deleteById(id);
    }
}
