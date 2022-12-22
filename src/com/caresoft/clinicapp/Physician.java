package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    
    // Inside class:    
    private ArrayList<String> patientNotes;
    //    private int id;
    
    // TO DO: Constructor that takes an ID
    public Physician(Integer id) {
    	super(id);
    }
    
    
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	String str = Integer.toString(pin);
    	int size = str.length();
    	if(size ==4) {
    	return true;}
    	else {
    		return false;}
    	}
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(confirmedAuthID == this.getId()) {
    	return true;
    	}else {
    		return false;}
    	}
    	
  
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters

}
