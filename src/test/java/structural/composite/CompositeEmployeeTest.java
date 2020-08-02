package structural.composite;

import org.junit.jupiter.api.Test;

class CompositeEmployeeTest {

    @Test
    void testComposite() {
        //Principal of the college
        CompositeEmployee principal = new CompositeEmployee("Dr.S.Som (Principal)",
                "Planning-Supervising-Managing");

        //The College has 2 Head of Departments-One from Mathematics, One from Computer Sc.
        CompositeEmployee hodMaths = new
                CompositeEmployee("Mrs.S.Das(HOD-Maths)", "Maths");

        CompositeEmployee hodCompSc = new CompositeEmployee
                ("Mr. V.Sarcar(HOD-CSE)", "Computer Sc.");

        //2 other teachers works in Mathematics department
        Employee mathTeacher1 = new EmployeeImpl("Math Teacher-1", "Maths");
        Employee mathTeacher2 = new EmployeeImpl("Math Teacher-2", "Maths");


        //3 other teachers works in Computer Sc. department
        Employee cseTeacher1 = new EmployeeImpl("CSE Teacher-1", "Computer Sc.");
        Employee cseTeacher2 = new EmployeeImpl("CSE Teacher-2", "Computer Sc.");
        Employee cseTeacher3 = new EmployeeImpl("CSE Teacher-3", "Computer Sc.");

        //Teachers of Mathematics directly reports to HOD-Maths
        hodMaths.add(mathTeacher1);
        hodMaths.add(mathTeacher2);

        //Teachers of Computer Sc. directly reports to HOD-CSE
        hodCompSc.add(cseTeacher1);
        hodCompSc.add(cseTeacher2);
        hodCompSc.add(cseTeacher3);

        //Principal is on top of college
        //HOD -Maths and Comp. Sc directly reports to him
        principal.add(hodMaths);
        principal.add(hodCompSc);


        //Printing the leaf-nodes and branches in the same way.
        //i.e. in each case, we are calling PrintStructures() method
        System.out.println("\n Testing the structure of a Principal object");
        principal.printStructures();

        System.out.println("\n Testing the structure of a HOD object:");
        System.out.println("Teachers working at Computer Science department:");
        hodCompSc.printStructures();

        //Leaf node
        System.out.println("\n Testing the structure of a leaf node:");
        mathTeacher1.printStructures();

        //Suppose, one computer teacher is leaving now from the organization.
        hodCompSc.remove(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 resigned, the organization has following members:");
        principal.printStructures();

    }
}