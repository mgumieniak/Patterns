package chainOfResponsibility;

import behavioral.chainOfResponsibility.HeaderTextProcessing;
import behavioral.chainOfResponsibility.ProcessingObject;
import behavioral.chainOfResponsibility.SpellCheckerProcessing;
import org.junit.jupiter.api.Test;

class ProcessingObjectTest {

    @Test
    void name() {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);
        String result = p1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);
    }
}