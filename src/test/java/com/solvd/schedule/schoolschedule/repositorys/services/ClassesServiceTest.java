package com.solvd.schedule.schoolschedule.repositorys.services;

import com.solvd.schedule.schoolschedule.models.Classes;
import com.solvd.schedule.schoolschedule.services.ClassesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ClassesServiceTest {
    @MockBean
    private ClassesService classesService;

    public Classes getClasses(){
        Classes classes=new Classes();
        classes.setClassId(1);
        classes.setClassTitle("A");
        return classes;
    }

    @Test
    public void testCreateClass(){
        Classes classes=getClasses();
        when(classesService.saveClasses(any(Classes.class))).thenReturn(classes);
        Classes savedClass=classesService.saveClasses(classes);
        assertThat(!savedClass.getClassTitle().isBlank());
    }

    @Test
    public void testUpdateClass(){
        Classes classes=getClasses();
        when(classesService.updateClasses(any(Classes.class))).thenReturn(classes);
        Classes updateClass=classesService.updateClasses(classes);
        assertThat(!updateClass.getClassTitle().isBlank());
    }

    @Test
    public void testDeleteClass(){
        doNothing().when(classesService).deleteClasses(1);
        classesService.deleteClasses(1);
        assertThat(true);
    }

    @Test
    public void testGetClass(){
        Classes classes=getClasses();
        given(classesService.getClasses(1)).willReturn(classes);
        Classes result=classesService.getClasses(1);
        assertEquals(result.getClassId(),1);
    }


}
