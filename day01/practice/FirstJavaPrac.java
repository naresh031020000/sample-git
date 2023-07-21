package day01.practice;

public class FirstJavaPrac {
	
	 public static void main(String[] args) {
			Name name=new Name();//name {a}
			name.name();
			Num num=new Num();//class reference variable=new class();// for memory allocation
			num.num();
			
		}
	 
	 
	 
	 
	 
	 public static class Name{//class
			
			void name() {//method
				System.out.println("Naresh");
			}
			int a=10;
			
			
		}
	 
	 
	 
	 
	 public static class Num{
			
			 void num() {
				System.out.print(3);
			}
		}
}

