package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.service.PatientService;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest
{
    @Autowired
    private PatientService patientService;

    private VisitDao visitDao;

    private DoctorDao doctorDao;

    private PatientDao patientDao;
    @Test
    public void testFindPatientById() {
       //give
       //when
       PatientTO patient = patientService.findById(1L);
       System.out.print(patient);
       //then
       assertThat(patient.getVisites().size()).isEqualTo(2);


       @Test
       public void testFindAllPatientVisitsById() {
           // give
           // when
           Set<VisitEntity> patientOneVisits =  patientService.findAllPatientVisites(1L);
           Set<VisitEntity> patientTwoVisits =  patientService.findAllPatientVisites(2L);
           // then
           assertThat(patientOneVisits.size()).isEqualTo(2);
           assertThat(patientTwoVisits.size()).isEqualTo(1);
       }

       @Test
       public void testDeletePatient(){
           // give
           PatientEntity patientEntity = new PatientEntity();
           patientEntity.setPatientNumber("1");
           patientEntity.setEmail("patient@test.com");
           patientEntity.setDateOfBirth(LocalDate.parse("2000-01-01"));

           // when
           patientService.deleteById(1L);
           // then
           PatientTO deletedPatient = patientService.findById(1L);
           assertThat(deletedPatient).isNull();
       }



}