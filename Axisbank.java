package Week3Day1;

public class Axisbank extends Bankinfo{

	
		public void deposit() {
			System.out.println("deposit");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Axisbank axis = new Axisbank();
			axis.fixed();
			axis.saving();
			axis.deposit();
		
			

		}
}

