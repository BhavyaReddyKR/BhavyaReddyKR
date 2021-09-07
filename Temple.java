class Temple{
static String[] templeName= new String[3];

public static void main(String a[]){
templeName[0]="Shiva";
templeName[1]="SriRama";
templeName[2]="Ganesha";
getTempleNames();
}
public static void getTempleNames(){
for(int z=0; z<templeName.length; z++){
System.out.println(templeName[z]);
}
}
}