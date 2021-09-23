package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		double finalGrade = grade1 + grade2 + grade3;
		return finalGrade;
	}
	public void result() {
		double finalGrade = finalGrade();
		if(finalGrade < 60 ) {
			System.out.printf("FAILED \nMISSING %.2f POINTS",(60 - (finalGrade*100)/100)); ;
		}else {
			System.out.print("PASS");
		}
	}
}
