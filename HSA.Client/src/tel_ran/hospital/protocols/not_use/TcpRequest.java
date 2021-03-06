package tel_ran.hospital.protocols.not_use;

public enum TcpRequest {
	ADD_DOCTOR,
	ADD_PATIENT,
	REMOVE_DOCTOR,
	REMOVE_PATIENT,
	UPDATE_DOCTOR,
	UPDATE_PATIENT,
	GET_DOCTOR,
	GET_PATIENT,
	
	BUILD_SCHEDULE,
	BOOK_VISIT,
	CANCEL_VISIT,
	
	GET_PATIENT_DOCTORS,
	GET_DOCTOR_PATIENTS,
	
	GET_VISITS,
	GET_FREE_VISITS,
	
	ADD_PULSE_INFO,
	GET_PULSE_BY_PERIOD

}
