import java.util.*;
class Happyno{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		sc.close();
		int sq=0;
		while(no){
			int rem=no%10;
			sq+=rem*rem;
			no/=10;
		}
		if(no==1){
			System.out.println("this is a Happy Number");
		}
		else{
			System.out.println("This is not Happy Number");
		}	
		}
}