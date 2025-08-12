package Skill6;
class prime{
  boolean  checkprime(int number) {
	 if(number<=1) {
		 return false;
	 }
	 for(int i=2;i<Math.sqrt(number);i++) {
		 if(number%i==0) {
			 return false;
		 }
	 }
	 return true;
 }
}
 public class pro1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =29;
		prime primeChecker = new prime();
        boolean result = primeChecker.checkprime(num);
		if(result) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}
	}
}

