package structural.composite;

public class EmployeeImpl implements Employee {
    private String name;
    private String dept;

    public EmployeeImpl(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void printStructures() {
        System.out.println(this.name + " works in " + this.dept);
    }
}
