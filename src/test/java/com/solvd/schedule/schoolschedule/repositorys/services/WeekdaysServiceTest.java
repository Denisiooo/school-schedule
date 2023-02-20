package com.solvd.schedule.schoolschedule.repositorys.services;

import com.solvd.schedule.schoolschedule.models.Weekdays;
import com.solvd.schedule.schoolschedule.services.WeekdaysService;
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
public class WeekdaysServiceTest {
    @MockBean
    private WeekdaysService weekdaysService;

    private Weekdays getWeekdays(){
        Weekdays weekdays=new Weekdays();
        weekdays.setWeekdayId(1);
        weekdays.setDayName("Test");
        return weekdays;
    }

    @Test
    public void testCreateWeekday(){
        Weekdays weekdays=getWeekdays();
        when(weekdaysService.saveWeekdays(any(Weekdays.class))).thenReturn(weekdays);
        Weekdays savedWeekday=weekdaysService.saveWeekdays(weekdays);
        assertThat(!savedWeekday.getDayName().isBlank());
    }

    @Test
    public void testUpdateWeekday(){
        Weekdays weekdays=getWeekdays();
        when(weekdaysService.updateWeekdays(any(Weekdays.class))).thenReturn(weekdays);
        Weekdays updateWeekday=weekdaysService.updateWeekdays(weekdays);
        assertThat(!updateWeekday.getDayName().isBlank());
    }

    @Test
    public void testDeleteWeekday(){
        doNothing().when(weekdaysService).deleteWeekdays(1);
        weekdaysService.deleteWeekdays(1);
        assertThat(true);
    }

    @Test
    public void testGetWeekday(){
        Weekdays weekdays=getWeekdays();
        given(weekdaysService.getWeekdays(1)).willReturn(weekdays);
        Weekdays result=weekdaysService.getWeekdays(1);
        assertEquals(result.getWeekdayId(),1);
    }
}
