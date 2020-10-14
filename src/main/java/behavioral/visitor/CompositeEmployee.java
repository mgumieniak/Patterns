package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {
    private final String name;
    private final String dept;
    private final int yearsOfExperience;
    private final List<Employee> controls;

    public CompositeEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
        this.controls = new ArrayList<>();
    }

    public void add(Employee employee) {
        controls.add(employee);
    }


    public void remove(Employee employee) {
        controls.remove(employee);
    }

    @Override
    public void printStructures() {
        System.out.println(this.name + " works in " + this.dept + " Experience: " + this.yearsOfExperience);
        controls.forEach(Employee::printStructures);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompositeElement(this);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
