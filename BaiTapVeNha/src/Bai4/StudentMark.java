package Bai4;

public class StudentMark implements IStudentMark{
	private String Fullname;
	private int ID;
	private String NameClass;
	private int Semester;
	private float AverageMark;
	int[] SubjectMark = new int[5];
	
	public StudentMark() {
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNameClass() {
		return NameClass;
	}

	public void setNameClass(String nameClass) {
		NameClass = nameClass;
	}

	public int getSemester() {
		return Semester;
	}
	
	public void setSemester(int semester) {
		Semester = semester;
	}
	
	public float getAverageMark() {
		return AverageMark;
	}
	
	@Override
	public void Display() {
		System.out.println("Fullname: " + Fullname);
		System.out.println("ID: " + ID);
		System.out.println("Name class: " + NameClass);
		System.out.println("Semester: " + Semester);
		System.out.println("Average mark: " + AverageMark);
	}
	
	public void AveCal() {
		this.AverageMark = (float) (SubjectMark[0] + SubjectMark[1] + SubjectMark[2] + SubjectMark[3] + SubjectMark[4]) / 5;	
	}
	
	
}
