package model;

public class Addresh {
	
	public int Ploat_no;
	public String Area;
	public String City;
	public void setPloat_no(int ploat_no) {
		Ploat_no = ploat_no;
	}
	public void setArea(String area) {
		Area = area;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Addresh [Ploat_no=" + Ploat_no + ", Area=" + Area + ", City=" + City + "]";
	}
	
	

}
