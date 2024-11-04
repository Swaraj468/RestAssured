package Demo;

import java.util.ArrayList;

public class practicepojo {
	private String id;
	private String studentName;
	private String RollNo;
	private ArrayList<Integer> phone;
	
public practicepojo(String id, String studentName, String RollNo){
	this.id = id;
	this.studentName = studentName;
	this.RollNo = RollNo;
	this.phone = new ArrayList<Integer>();
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getRollNo() {
	return RollNo;
}

public void setRollNo(String rollNo) {
	RollNo = rollNo;
}

public ArrayList<Integer> getPhone() {
	return phone;
}

public void setPhone(ArrayList<Integer> phone) {
	this.phone = phone;
}
public void setMobile(int...a) {
	for(int i=0; i<a.length; i++) {
	this.phone.add(a[i]);
}
}
}
