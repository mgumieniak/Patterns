package behavioral.visitor;

public class EmployeeImpl implements Employee {
    private final String name;
    private final String dept;
    private final int yearsOfExperience;


    public EmployeeImpl(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void printStructures() {
        System.out.println(this.name + " works in " + this.dept + " Experience: " + this.yearsOfExperience);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLeafNode(this);
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
