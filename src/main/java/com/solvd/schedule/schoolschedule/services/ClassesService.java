package com.solvd.schedule.schoolschedule.services;

import com.solvd.schedule.schoolschedule.models.Classes;
import com.solvd.schedule.schoolschedule.repositorys.IClassRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ClassesService {

    private IClassRepository iClassRepository;

    public ClassesService(IClassRepository iClassRepository) {
        this.iClassRepository = iClassRepository;
    }

    @Transactional
    public Classes saveClasses(Classes classes) {
        return iClassRepository.save(classes);
    }

    public Classes getClasses(long id) {
        Optional<Classes> classes = iClassRepository.findById(id);
        if (classes.isEmpty()) return null;
        return classes.get();
    }

    @Transactional
    public Classes updateClasses(Classes classes) {
        return iClassRepository.save(classes);
    }

    @Transactional
    public void deleteClasses(long id) {
        iClassRepository.deleteById(id);
    }
}
