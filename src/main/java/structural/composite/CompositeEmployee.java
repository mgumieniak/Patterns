package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {
    private String name;
    private String dept;
    private List<Employee> controls;

    public CompositeEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
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
        System.out.println(this.name + " works in " + this.dept);
        controls.forEach(Employee::printStructures);
    }
}
