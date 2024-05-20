package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.dao.AddressDao;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

public class PatientServiceImpl implements PatientService {

    private final PatientDao PatientDao;
    private final AddressDao AddressDao;

    public PatientServiceImpl(PatientDao patientDao, AddressDao addressDao)
    {
        PatientDao = patientDao;
        AddressDao = addressDao;
    }

    @Override
    public PatientTO findById(Long id) {
        final PatientEntity entity = PatientDao.findOne(id);
        return PatientMapper.mapToTO(entity);
    }
    @Override
    public void deleteById(Long id) {
        AddressDao.delete(id);
        PatientDao.delete(id);
    }
    @Override
    public Set<VisitEntity> findAllPatientVisites (final Long id) {
        final PatientEntity entity = PatientDao.findOne(id);
        return entity.getVisites();
    }
    public void save(PatientTO patient) {}
}
