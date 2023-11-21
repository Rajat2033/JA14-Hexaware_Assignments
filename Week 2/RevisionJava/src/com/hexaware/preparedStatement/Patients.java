package com.hexaware.preparedStatement;

public class Patients {
	private int pid;
	private String pname;
	private String pdisease;
	private String pcity;
	public Patients(int pid, String pname, String pdisease, String pcity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdisease = pdisease;
		this.pcity = pcity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdisease() {
		return pdisease;
	}
	public void setPdisease(String pdisease) {
		this.pdisease = pdisease;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", pname=" + pname + ", pdisease=" + pdisease + ", pcity=" + pcity + "]";
	}
	
	

}
