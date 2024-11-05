package Demo;

import java.util.ArrayList;

public class universitypojo {
	private String UniName;
	private int Reg;
	private String Branch;
	private String Subject;
	
	public universitypojo(String UniName, String Branch, String Subject, int Reg) {
		
		this.UniName=UniName;
		this.Branch=Branch;
		this.Subject=Subject;
//		this.Reg=new ArrayList<Integer>();
		this.Reg=Reg;
		
	}

	public String getUniName() {
		return UniName;
	}

	public void setUniName(String uniName) {
		UniName = uniName;
	}

//	public ArrayList<Integer> getReg() {
//		return Reg;
//	}
//
//	public void setReg(ArrayList<Integer> reg) {
//		Reg = reg;
//	}

	public String getBranch() {
		return Branch;
	}

	public int getReg() {
		return Reg;
	}

	public void setReg(int reg) {
		Reg = reg;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}
	


}
