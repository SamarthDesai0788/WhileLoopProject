package basic;

public class methods {
void print()
{
	System.out.println("void type");
}
int add() {
	int a=20,b=40;
	return a+b;
	
}
	static char disp() {
		return 'a';
	}
	int multiple(int a,int b) {
		return a*b;
	}
	void sub(int n1,int n2) {
		System.out.println("substraction"+(n1+n2));
	}
	public static void main(String[] args) {
methods m=new methods();
m.print();
System.out.println("Addition of numbers"+m.add());
System.out.println("char return type"+methods.disp());
System.out.println("multiplication"+m.multiple(10, 20));
m.sub(23,22);
	}

	
}
