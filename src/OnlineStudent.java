public class OnlineStudent extends Student {
    private String state;


    public OnlineStudent(String  firstName, String lastName, String state) {
        super(firstName, lastName, state);


        setId(generatedId());
    }



    @Override
    public String generatedId() {
        return getFirstName().substring(0, 3) + getLastName().substring(0, 3) + state.substring(0, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " ID : "  + getId() +  "State : " + state;
    }
}



