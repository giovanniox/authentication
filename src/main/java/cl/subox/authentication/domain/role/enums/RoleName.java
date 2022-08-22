package cl.subox.authentication.domain.role.enums;


public enum RoleName {
    ADMIN("ADMIN"),
    WORKER("WORKER"),
    USER("USER");

    private final String roleName;

    private RoleName(final String s) {
        this.roleName = s;
    }

    public boolean equalsName(final String otherRoleName) {
        if (otherRoleName == null) {
            return false;
        }
        return this.roleName.equals(otherRoleName);
    }

    @Override
    public String toString() {
        return this.roleName;
    }


}
