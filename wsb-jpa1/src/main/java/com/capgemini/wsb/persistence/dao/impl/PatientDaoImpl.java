package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
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
    public List<PatientEntity> findByAdult(boolean isAdult) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.isAdult= :isAdult").setParameter("isAdult",isAdult).getResultList();
    }

    @Override
    public PatientEntity findById(int id){
    //    return entityManager.createQuery("select visit from VisitEntity patient where patient.id= :id").setParameter("id",id).getResultList();
        return findOne((long)id);
    }


}

