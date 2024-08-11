package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse implements Staff {

    private String name;
    @Override
    public void assist (){
        System.out.println("Nurse is assisting");
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                '}';
    }
}
