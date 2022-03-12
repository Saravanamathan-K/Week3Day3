package Week3Day1;

public class Students {

			public void getStudentInfo(int ID) {
				System.out.println(ID);
			}
			
			public void getStudentInfo(String name, int ID) {
				System.out.println(ID+" "+name);
			}
			
			public void getStudentInfo(String email, String phoneNumber) {
				System.out.println(email+" "+phoneNumber);
			}
			
			public static void main(String[] args) {
				Students stds = new Students();
				stds.getStudentInfo(1);
				stds.getStudentInfo("Charlie", 2);
				stds.getStudentInfo("123test@gmail.com", "End of info");
			}
		

	}


