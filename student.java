package org.student;

	import org.department.Department;

	public class student extends Department {
		
		
		public void StudentName() {
			System.out.println("StudentName -Student class org.Student");
		}
		
		public void studentDept() {
			System.out.println("studentDept -Student class org.Student");
		}

		public void studentId() {
			System.out.println("studentId -Student class org.Student");
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			student student = new student();
			student.collegeCode();
			student.collegeName();
			student.collegeRank();
			student.deptName();
			student.StudentName();
			student.studentDept();
			student.studentId();
		}

	}

