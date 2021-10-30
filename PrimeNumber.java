package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=13;
		boolean flag = false;
		int m=input/2;
		for (int i=2;i<=m;i++)
		{
			if (input%i==0)
				flag=true;
			break;
					
		}
		if (flag==true)
		
			System.out.println("number is not prime"+input);
		else
			
			System.out.println("number is  prime"+input);
		

	}

}
