
package Task2222;

public class Registry {
static Patient[] patientList = new Patient[5]; 

    
Registry(){
System.out.println("Регитратура: Мы записываем пациентов!!");
}



public void registr(Patient patient){
for(int i=0; i<patientList.length;i++){
if(patientList[i]==null){
patientList[i]= patient;
break;
}
}
}
}