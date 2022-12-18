package cl.subox.ms.aud.domain.entities.address.enums;

public enum Provider {
    LOCAL("LOCAL");
    private final String name;

    private Provider(final String s) {
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
