package com.solvd.schedule.schoolschedule.services;

import com.solvd.schedule.schoolschedule.models.Classrooms;
import com.solvd.schedule.schoolschedule.repositorys.IClassroomRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ClassroomService {

    private IClassroomRepository iClassroomRepository;

    public ClassroomService(IClassroomRepository iClassroomRepository) {
        this.iClassroomRepository = iClassroomRepository;
    }

    @Transactional
    public Classrooms saveClassrooms(Classrooms classrooms) {
        return iClassroomRepository.save(classrooms);
    }

    public Classrooms getClassrooms(long id) {
        Optional<Classrooms> classrooms = iClassroomRepository.findById(id);
        if (classrooms.isEmpty()) return null;
        return classrooms.get();
    }

    @Transactional
    public Classrooms updateClassrooms(Classrooms classrooms) {
        return iClassroomRepository.save(classrooms);
    }

    @Transactional
    public void deleteClassrooms(long id) {
        iClassroomRepository.deleteById(id);
    }
}
