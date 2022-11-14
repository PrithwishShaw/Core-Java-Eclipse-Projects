package com.player.sweety;

public class child extends parent {
	
	private String child_Name;
	private String child_DOB;
	public child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public child(String father_name, String mother_name, String marriage_date) {
		super(father_name, mother_name, marriage_date);
		// TODO Auto-generated constructor stub
	}
	
	public child(String father_name, String mother_name, String marriage_date, String child_Name, String child_DOB) {
		super(father_name, mother_name, marriage_date);
		this.child_Name = child_Name;
		this.child_DOB = child_DOB;
	}
	public String getChild_Name() {
		return child_Name;
	}
	public void setChild_Name(String child_Name) {
		this.child_Name = child_Name;
	}
	public String getChild_DOB() {
		return child_DOB;
	}
	public void setChild_DOB(String child_DOB) {
		this.child_DOB = child_DOB;
	}
	@Override
	public String toString() {
		return "Parent [Father_name=" + getFather_name()
				+ ", Mother_name=" + getMother_name() + ", Marriage_date=" + getMarriage_date()+", child_Name=" + child_Name + ", child_DOB=" + child_DOB + "]";
	}
	
}
