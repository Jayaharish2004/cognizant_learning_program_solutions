public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Harish", "S1001", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        System.out.println("\n--- Updating Student Details ---\n");

        // Update data
        controller.setStudentName("Jayaharish");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
