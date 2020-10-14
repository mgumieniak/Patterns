package behavioral.visitor;

public class VisitorImpl implements Visitor {

    public void visitCompositeElement(CompositeEmployee employee) {
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 15;
        System.out.println("\t\t" + employee.getName() + "from"
                + employee.getDept() + "is eligible for promotion?" +
                eligibleForPromotion);
    }

    public void visitLeafNode(Employee employee) {
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 12;
        System.out.println("\t\t" + employee.getName() + "from"
                + employee.getDept() + "is eligible for promotion?" +
                eligibleForPromotion);

    }
}
