/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollectionw11;

/**
 *
 * @author novia
 */
public class StudentIdentity {
    private int no;	
    private String id;
    private String studentName;		
    private String gender;
    
    public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String StudentName) {
		this.studentName = StudentName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String Gender) {
		this.gender = Gender;
	}
        
        @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return getNo() + " | " + getId() + " | " + getstudentName() + " | " + getGender();
    	}
	
}
