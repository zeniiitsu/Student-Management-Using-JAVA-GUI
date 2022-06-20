class Student {
	private int rno;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;

	public Student() {
		rno = 0;
		name = null;
		marks1 = 0;
		marks2 = 0;
		marks3 = 0;
	}

	public Student(int rno, String name, int marks1, int marks2, int marks3) {
		this.rno = rno;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public String toString() {
		return rno + " " + name + " " + marks1 + " " + marks2 + " " + marks3;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getRno(){
		return rno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public int getMarks3() {
		return marks3;
	}
     }