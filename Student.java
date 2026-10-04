package model;

public class Student {
	
	private String name;
	private int Roll;
	Addresh Add;
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public void setAdd(Addresh add) {
		Add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Roll=" + Roll + ", Add=" + Add + "]";
	}
	
	
	
	
	
	

}
