package com.solvd.schedule.schoolschedule;

import com.solvd.schedule.schoolschedule.models.Classes;
import com.solvd.schedule.schoolschedule.models.Classrooms;
import com.solvd.schedule.schoolschedule.services.ClassesService;
import com.solvd.schedule.schoolschedule.services.SubjectService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolScheduleApplication implements CommandLineRunner {

	private ClassesService classesService;
	private SubjectService subjectService;

	public SchoolScheduleApplication(ClassesService classesService, SubjectService subjectService) {
		this.classesService = classesService;
		this.subjectService = subjectService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SchoolScheduleApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(classesService.getClasses(1).toString());
		System.out.println(subjectService.getSubjects(1).toString());
	}


}
