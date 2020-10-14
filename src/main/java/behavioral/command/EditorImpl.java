package behavioral.command;

public class EditorImpl implements Editor {
    @Override
    public void save() {
        System.out.println("SAVE");
    }

    @Override
    public void open() {
        System.out.println("OPEN");
    }

    @Override
    public void close() {
        System.out.println("CLOSE");
    }
}
