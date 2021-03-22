package csce247.assignments.singelton;

import java.util.ArrayList;

/**
 * The Patient class contains information about the people in the HospitalSystem, with methods to access and change that information.
 * @author colin
 */

public class Patient {
	
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;
	
	/**
	 * The constructor simply takes in data, sets the corresponding variables, and initializes the allergies ArrayList.
	 * @param id A Patient's unique integer identifier.
	 * @param firstName The first name of the patient.
	 * @param lastName The last name of the patient.
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.allergies = new ArrayList<String>();
	}
	
	/**
	 * Here, a String is added to the allergy ArrayList.
	 * @param allergy A String containing the allergy.
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	
	/**
	 * The toString method puts all of the Patient's information into a single String.
	 * @return A String containing all of the Patient's information.
	 */
	public String toString() {
		String ret = "Patient " + (this.id + 1) + ": " + firstName + " " + lastName;
		if(allergies.size() != 0) {
			ret += "\n\tAllergies: ";
			for(int i = 0; i < allergies.size(); i++) {
				if(i != allergies.size() - 1) {
					ret += allergies.get(i);
					ret += ", ";
				}
				else {
					ret += allergies.get(i);
					break;
				}
			}
		}
		return ret;
	}
}
