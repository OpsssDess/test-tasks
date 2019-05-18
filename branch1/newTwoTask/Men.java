
package newTwoTask;


public abstract class Men{
private String name;
private int age;
private String healthStatus;
private int id;

Men(String name, int age, String healthStatus, int id){
this.name = name;
this.age = age;
this.healthStatus = healthStatus;
this.id = id;
}

public String getName() {
        return name;
    }
 
public void setName(String name) {
        this.name = name;
    }

public int getAge() {
        return age;
    }
 
public void setAge(int age) {
        this.age = age;
    }

public String getHealthStatus() {
        return healthStatus;
    }
 
public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

public int getId() {
        return id;
    }
 
public void setId(int id) {
        this.id = id;
    }

}