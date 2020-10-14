package behavioral.visitor;

public interface Visitor {
    void visitCompositeElement(CompositeEmployee employees);

    void visitLeafNode(Employee employee);

}
