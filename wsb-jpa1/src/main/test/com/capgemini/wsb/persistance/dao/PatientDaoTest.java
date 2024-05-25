package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Test
    public void findBySurnameTest() {
        //given
        final String pSurname = "Kowalski";
        //when
        final List<PatientEntity> patients = patientDao.findBySurname(pSurname);
        //then
        assertThat(patients).isNotNull();
    }

    @Test
    public void findByVisitsCountTest() {
        //given
        final int visites = 2;
        //when
        final List<PatientEntity> patientVisits = patientDao.findByVisitsCount(visites);
        //then
        assertThat(patientVisits).isNotNull();
        assertThat(patientVisits.size()).isEqualTo(2);
    }

    @Test
    public void testIfAdult() {
        //given
        final boolean isAdult = True;
        //when
        final List<PatientEntity> patients = patientDao.testIfAdult(isAdult);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.size()).isEqualTo(1);
    }

    @Test
    public void findByAdult
}