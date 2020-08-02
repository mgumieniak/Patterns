package creational.singleton;

public enum Singleton {
    MACIEJ("Maciej"),
    PAWEL("Pawel");

    private final String name;

    Singleton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
