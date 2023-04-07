package Constructor;

public class Basics {

	int a;
	int b;
	int m;
	String Name;
	String Surname;
	
	Basics() {                   //user defined constructor without parameters
		
		this.a=78;
		this.b=68;
	}
	
	Basics(int c,int d){        //user defined constructor with parameters
		
		this.a=c;
		this.b=d;
	}
	
	Basics(int c,int d,int i){           //user defined constructor with parameters

		this.a=c;
		this.b=d;
		this.m=i;
		
	}
	
	Basics (String Name,String Surname){
		
		this.Name="Amin";
		this.Surname="Shaikh";
	}
	
	public void addition () {           //non static method
		System.out.println(a+b+m);
	}
	
	public void FullName () {
		System.out.println("Amin Shaikh ");
	}
	
	public static void main(String[] args) {
		
		Basics x = new Basics();
		x.addition();
		
		Basics y = new Basics(80,40);
		y.addition();
		
		Basics z = new Basics(20,10,40);
		z.addition();
		
		Basics q = new Basics("this.Name","this.Surname");
		q.FullName();
	}
}
