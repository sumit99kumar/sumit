package com.app;

class StudentInfo {
	int rollno;
	String name;
	float fee;

	StudentInfo(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis2 {
	public static void main(String args[]) {
		StudentInfo s1 = new StudentInfo(111, "ankit", 5000f);
		StudentInfo s2 = new StudentInfo(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}