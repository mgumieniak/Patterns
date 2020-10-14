package command;

import behavioral.command.Editor;
import behavioral.command.EditorImpl;
import behavioral.command.Macro;
import org.junit.jupiter.api.Test;

class MacroTest {

    @Test
    void shouldRunMethodFromCommand() {
        Editor editor = new EditorImpl();

        Macro macro = new Macro();
        macro.record(editor::open);
        macro.record(editor::save);
        macro.record(editor::close);
        macro.run();
    }
}