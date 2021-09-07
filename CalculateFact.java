class CalculateFact{

public static void main(String a[]){
System.out.println("main method started");
myFactorial(4,1);
System.out.println("main method ended");
}
public static void myFactorial(int num1,int num2){
System.out.println("myFactorial method started");
int fact=1;

for(int i=1;i<=num1;i++)
{
fact=(fact*i)/((fact-r)*r);
}
System.out.println(fact);
System.out.println("myFactorial method ended");

}
}