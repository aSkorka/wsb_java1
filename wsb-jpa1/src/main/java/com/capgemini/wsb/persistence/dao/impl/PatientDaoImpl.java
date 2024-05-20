package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {


    @Override
    public List<PatientEntity> findBySurname(String pSurname) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.lastName like :surname").setParameter("surname", pSurname).getResultList();
    }

    @Override
    public List<PatientEntity> findByVisitsCounter(int visits) {
        return entityManager.createQuery("select patient from PatientEntity patient " + " join patient.visits visit " +
                " where visit.size > :visits").setParameter("visits", visits).getResultList();
    }

    @Override
    public List<PatientEntity> findByAdult(String isAdult) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.isAdult =True").setParameter("isAdult",isAdult).getResultList();
    }

    public List<VisitEntity> findById(int id){
        return entityManager.createQuery("select visit from VisitEntity patient where patient.id like id").setParameter("id",id).getResultList();
    }
}
