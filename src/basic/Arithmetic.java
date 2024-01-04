package basic;

public class Arithmetic {
void print()
{
	System.out.println("all arithmatic operations");
}
int addition(int a1,int a2) 
{
	return a1+a2;
}
int substraction(int s1,int s2) 
{
	return s1-s2;
}
int multiplication(int m1,int m2) 
{
	return m1*m2;
}
int division(int d1,int d2)
{
	return d1/d2;
}
int modulus(int p1,int p2)
{
	return p1%p2;
}
	public static void main(String[] args) {
		Arithmetic a1=new Arithmetic();
		a1.print();
		System.out.println(" addition of two number " +a1.addition(5,2));
		System.out.println(" substarction of two number " +a1.substraction(10,5 ));
		System.out.println(" multiplication two number " +a1.multiplication(20, 2));
		System.out.println(" divison of two number " +a1.division(10, 5));
		System.out.println(" modulus of two number "  +a1.modulus(100, 200));
	}

}
