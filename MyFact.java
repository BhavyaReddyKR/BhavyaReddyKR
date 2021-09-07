class MyFact{

public static void main(String a[]){
myFactorial(5);
}
public static void myFactorial(int num){
int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;
}
System.out.println(fact);

}
}