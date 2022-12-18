package cl.subox.ms.aud.domain.entities.person.enums;

public enum Sex {
    HOMBRE("HOMBRE"),
    MUJER("MUJER");
    private final String name;

    Sex(final String s) {
        this.name = s;
    }

    public boolean equalsName(final String otherName) {
        if (otherName == null) {
            return false;
        }
        return this.name.equals(otherName);
    }

    @Override
    public String toString() {
        return this.name;
    }


}
