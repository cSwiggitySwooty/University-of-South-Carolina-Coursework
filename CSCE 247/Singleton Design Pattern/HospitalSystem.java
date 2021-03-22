package csce247.assignments.singelton;

import java.util.ArrayList;

/**
 * The HospitalSystem class is the singleton. It contains ways to get patient data as well as add to it. It contains a HospitalSystem within itself, which it creates with the constructor.
 * For outside classes to use this, they have to call the getInstance() method which returns the instance or creates it if there is not one.
 * @author colin
 */

public class HospitalSystem {
	
	private ArrayList<Patient> patients;
	private static HospitalSystem hospitalSystem;
	
	/**
	 * The constructor simply initializes the patients ArrayList.
	 */
	private HospitalSystem() {
		this.patients = new ArrayList<Patient>();
	}
	
	/**
	 * The getInstance method is called by people outside. If there is no instance already (aka hospitalSystem is null), it creates one and returns it.
	 * @return The HospitalSystem instance.
	 */
	public static HospitalSystem getInstance() {
		if(hospitalSystem != null) {
			return hospitalSystem;
		}
		return new HospitalSystem();
	}
	
	/**
	 * The addPatient method simply creates a new patient, adds it to the ArrayList, and then returns the patient ID.
	 * @param firstName The first name of the patient.
	 * @param lastName The last name of the patient.
	 * @return The integer ID of the patient.
	 */
	public int addPatient(String firstName, String lastName) {
		int patID = patients.size();
		Patient pat = new Patient(patID, firstName, lastName);
		patients.add(pat);
		return patID;
	}
	
	/**
	 * getRecord simply returns the patient at a certain index (patient ID).
	 * @param id The unique ID given to the patient.
	 * @return The Patient at the given ID.
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	
	/**
	 * The addAllergy method simply adds the allergy by calling the Patient's addAllergy method.
	 * @param id The integer ID given to a Patient.
	 * @param allergy A String dictating what allergy the Patient has.
	 */
	public void addAllergy(int id, String allergy) {
		patients.get(id).addAllergy(allergy);
	}
	
	/**
	 * This method returns information on all Patients.
	 * @return String that contains all Patient information.
	 */
	public String getAllPatientsData() {
		String ret = "";
		for(Patient p : patients) {
			ret += p;
			ret += "\n\n";
		}
		return ret;
	}
	
}
