public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new OnCampusStudent("John", "Doe", 1234),
            new OnlineStudent("Jane", "Doe", "CA")
        };
        for(Student student : students) {
            System.out.println(student);
        }
        }
    }

