package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import java.util.Set;
public interface PatientService {

    public PatientTO findById(final Long id);

    public Set<VisitEntity> findAllPatientVisites (final Long id);

    public void deleteById(Long id);
}
