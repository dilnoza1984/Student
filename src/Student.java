public class Student {

        private String firstName;
        private String lastName;
        private String id;
        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String generatedId() {
            return  "";
        }
        @Override
        public String toString() {
            return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
        }
    }

