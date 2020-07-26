package com.nt.comp;

public class Student {
      private int sno;
      private String sname;
      private String add;
      private float avg;
      
	public Student() {
		System.out.println("Student::0-param constructor");
	}

	public Student(int sno, String sname, String add, float avg) {
		this.sno = sno;
		this.sname = sname;
		this.add = add;
		this.avg = avg;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", add=" + add + ", avg=" + avg + "]";
	}	
	
	
      
}
