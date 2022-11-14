package com.player.sweety;

public class parent implements birth{

	private String father_name;
	private String mother_name;
	private String marriage_date;
	
	
	public parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public parent(String father_name, String mother_name, String marriage_date) {
		super();
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.marriage_date = marriage_date;
	}


	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getMarriage_date() {
		return marriage_date;
	}
	public void setMarriage_date(String marriage_date) {
		this.marriage_date = marriage_date;
	}
	
	public void displayAll(parent p) {
		
		System.out.println(p);
		
	}
}
