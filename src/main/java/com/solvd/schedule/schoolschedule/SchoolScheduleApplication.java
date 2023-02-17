package com.solvd.schedule.schoolschedule;

import com.solvd.schedule.schoolschedule.models.*;
import com.solvd.schedule.schoolschedule.services.ClassesService;
import com.solvd.schedule.schoolschedule.services.SubjectService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

@SpringBootApplication
public class SchoolScheduleApplication implements CommandLineRunner {
	private static final Logger logger= LogManager.getRootLogger();
	private Scanner scanner=new Scanner(System.in);
	private Algorithm algorithm;
	private ClassesService classesService;
	private SubjectService subjectService;
	private ClassGeneration classGeneration;
	private DefaultValues defaultValues;

	public SchoolScheduleApplication(ClassesService classesService, SubjectService subjectService, ClassGeneration classGeneration, DefaultValues defaultValues,Algorithm algorithm) {
		this.classesService = classesService;
		this.subjectService = subjectService;
		this.classGeneration = classGeneration;
		this.defaultValues = defaultValues;
		this.algorithm=algorithm;
	}

	public static void main(String[] args) {
		SpringApplication.run(SchoolScheduleApplication.class, args);
	}

	@Override
	public void run(String... args) {
		getStart();
	}

	public void getStart(){
		logger.info("Insert min, max lessons");
		int min=scanner.nextInt();
		int max=scanner.nextInt();
		int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		Weekdays[] weekdays=classGeneration.getWeekdays();
		Classes[] classes=classGeneration.getClasses();

		for (int i=0;i< weekdays.length;i++){
			int oo=0;
			for(int j=0;j<classes.length;j++){
				defaultValues.setStaticTeacher();
				defaultValues.setStaticSubject();
				logger.info("Day: "+weekdays[i].getDayName()+", Class: "+classes[j].getClassTitle());
				Hromosome[] resultCheck=getUniqHromosome(classGeneration.getHromosomes());
//				for (int t=0;t<resultCheck.length;t++)
//				logger.info(resultCheck[t].toString());

				Hromosome[] result=algorithm.start(random_int,resultCheck,oo);
				for(int t1=0;t1<random_int;t1++)
					logger.info(result[t1].toString());
				oo++;
				logger.info("========");
			}
		}
	}
	private Hromosome[] getUniqHromosome(Hromosome[] hromosomes){
		HashSet<Hromosome> hromosomes1=new HashSet<>();
		for(int i=0;i<hromosomes.length;i++){
			hromosomes1.add(hromosomes[i]);
		}
		Hromosome[] result= new Hromosome[hromosomes1.size()];
		int i=0;
		for(Hromosome h:hromosomes1)
			result[i++]=h;
		return result;
	}


}
