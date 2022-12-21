package cl.subox.ms.aud.domain.entities.role.enums;


public enum RoleRank {
    NIVEL_1("NIVEL_1"),
    NIVEL_2("NIVEL_2"),
    NIVEL_3("NIVEL_3"),
    NIVEL_4("NIVEL_4"),
    NIVEL_5("NIVEL_5");
    private final String roleRank;

    RoleRank(final String s) {
        this.roleRank = s;
    }

    public boolean equalsName(final String otherRoleRank) {
        if (otherRoleRank == null) {
            return false;
        }
        return this.roleRank.equals(otherRoleRank);
    }

    @Override
    public String toString() {
        return this.roleRank;
    }


}
