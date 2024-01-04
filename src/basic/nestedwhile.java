package basic;

public class nestedwhile {

	public static void main(String[] args) {
		int i=1;
		int n=5;
		while(i<=n) {     //1<=5//2<=5//3<=5//4<=5
			int j=1;
			while(j<=n) {  //1<=5//2<=5//3<=5//4<=5
				
			if(j<=n-i)     //1<=5-1=4//2<=5-2=3//3<=5-3=2//4<=4-5=1
			{
				System.out.print(" ");//4spaces//3spaces//2spaces//1 space
			}
			else
			{
				System.out.print("*");//4 space 1 star//3space 2star//2sapce 3star//1space 4 star// no space 5star
			}
			j++;
			}
				System.out.println();
			i++;
			}
		}
		
	
}

