
package Task2222;

import static Task2222.Registry.patientList;

public class Doctor extends Men{
public String position;


public Doctor(String name, int age, String healthStatus, String position, int id){
super(name,age,healthStatus, id);
this.position = position;
System.out.println("Я человек: "+ name +" "+age+" года "+healthStatus+" Я доктор, моя позиция "+position );
}

public void showPatient(){
for(Patient i: patientList) {
System.out.println("у доктора "+ getName()+" лечаться: " +i.getName());
} 

}
}

