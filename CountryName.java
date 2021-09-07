class Country{
static String[] countryName= new String[7];
public static void main(String a[]){

countryName[0]="India";
countryName[1]="Sri Lanka";
countryName[2]="England";
countryName[3]="Pakistan";
countryName[4]="China";
countryName[5]="Andorra";
countryName[6]="USA";
getCountryNames();
}

public static void getCountryNames(){
for(int z=0;z<countryName.length;z++){
System.out.println(countryName[z]);
}
}
}