package behavioral.visitor;

public interface Employee {
    void printStructures();

    void accept(Visitor visitor);

    int getYearsOfExperience();

    String getName();

    String getDept();
}
