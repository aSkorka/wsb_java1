package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;
public interface PatientDao extends Dao<PatientEntity, Long>{

    List<PatientEntity> findBySurname(String pSurname);

    List<PatientEntity> findByVisitsCounter(int visits);

    List<PatientEntity> findByAdult(boolean isAdult);

    PatientEntity findById(int id);
}
