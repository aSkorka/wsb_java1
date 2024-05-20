package com.capgemini.wsb.persistence.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	private boolean isAdult;


	private String firstName;


	private String lastName;


	private String telephoneNumber;

	private String email;


	private String patientNumber;


	private LocalDate dateOfBirth;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "PATIENT_ID", referencedColumnName = "ID")
	private Set<VisitEntity> visits = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getAdult() {return isAdult; }

	public void setAdult(boolean isAdult) { this.isAdult = isAdult;}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setVisits(Set<VisitEntity> visites) {
		this.visits = visits;
	}
	public Set<VisitEntity> getVisites(){
		return visits;
	}
}
