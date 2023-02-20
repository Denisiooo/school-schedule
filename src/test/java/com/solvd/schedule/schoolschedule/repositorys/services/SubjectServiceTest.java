package com.solvd.schedule.schoolschedule.repositorys.services;

import com.solvd.schedule.schoolschedule.models.Subjects;
import com.solvd.schedule.schoolschedule.services.SubjectService;
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

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SubjectServiceTest {

    @MockBean
    private SubjectService subjectService;

    private Subjects getSubject() {
        Subjects subjects = new Subjects();
        subjects.setSubjectId(1);
        subjects.setSubjectTitle("TestSubject");
        subjects.setR(5);
        subjects.setH(1);
        return subjects;
    }

    @Test
    public void testCreateSubject() {
        Subjects subjects = getSubject();
        when(subjectService.saveSubjects(any(Subjects.class))).thenReturn(subjects);
        Subjects savedSubject = subjectService.saveSubjects(subjects);
        assertThat(!savedSubject.getSubjectTitle().isBlank());
    }

    @Test
    public void testUpdateSubject() {
        Subjects subjects = getSubject();
        when(subjectService.updateSubjects(any(Subjects.class))).thenReturn(subjects);
        Subjects updatedSubject = subjectService.updateSubjects(subjects);
        assertThat(!updatedSubject.getSubjectTitle().isBlank());
    }

    @Test
    public void testDeleteSubject() {
        doNothing().when(subjectService).deleteSubjects(1);
        subjectService.deleteSubjects(1);
        assertThat(true);
    }

    @Test
    public void testGetSubject(){
        Subjects subjects=getSubject();
        given(subjectService.getSubjects(1)).willReturn(subjects);
        Subjects result=subjectService.getSubjects(1);
        assertEquals(result.getSubjectId(),1);
    }


}
