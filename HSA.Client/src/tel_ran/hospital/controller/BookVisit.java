package tel_ran.hospital.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import tel_ran.hospital.entities.not_use.Doctor;
import tel_ran.hospital.protocols.not_use.RestResponseCode;

public class BookVisit extends HospitalItem {
	@Override
	public String displayedName() {
		return "Book visit to doctor";
	}

	@Override
	public void perform() {
		Integer doctorId=inputOutput.getInteger("Enter doctor id");
		Integer patientId=inputOutput.getInteger("Enter patient id");
		Integer hours=inputOutput.getInteger("Enter hour for your visit");
		Integer minutes=inputOutput.getInteger("Enter minutes for your visit");
		LocalDateTime dateTime=inputOutput.getDate
				("Enter pick date in the format "+format, format).atTime(hours, minutes);


		
		String res = hospital.bookVisit(doctorId, patientId, dateTime);
		if (res==RestResponseCode.NO_DOCTOR)
		{
			inputOutput.put(String.format("Doctor with id %d doesn`t exist", doctorId));
			return;
		}
		if (res==RestResponseCode.NO_PATIENT)
		{
			inputOutput.put(String.format("Doctor with id %d doesn`t exist", doctorId));
			return;
		}
		if (res==RestResponseCode.NO_SCHEDULE)
		{
			inputOutput.put(String.format("Doctor with id %d doesn`t have shedule for this time", doctorId));
			return;
		}
		if (res==RestResponseCode.VISIT_BUSY)
		{
			inputOutput.put(String.format("Doctor with id %d will have visit in this time", doctorId));
			return;
		}
		if (res==RestResponseCode.OK)
		{
		inputOutput.put(String.format("Doctor with id %d will wait your visit at %t",
		doctorId,dateTime.toString()));
		}
	}

}
