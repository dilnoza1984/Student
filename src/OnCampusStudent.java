public class OnCampusStudent {
    private  int badgeNO;
    public OnCampusStudent(String firstName, String lastName, int badgeNO) {
        super(firstName, lastName);
        this.badgeNO = badgeNO;
        setId(generatedId());
    }
    public String generatedId() {
        return getFirstName().substring(0, 3) + getLastName().substring(0, 3) + badgeNO;
    }
    @Override
    public String toString() {
        return super.toString() + " ID : "  + getId() +  "Badge No : " + badgeNO;
    }
}
