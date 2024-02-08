import courses.Course;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This example illustrates an anonymous class that implements the Comparator interface.
 */
public class Main {
  public static void main(String[] args) {
    List<Course> courses = new ArrayList<>();
    courses.add(new Course("Math", 94));
    courses.add(new Course("English", 76));
    courses.add(new Course("Science", 88));

    // Sorting using an anonymous class
    courses.sort(new Comparator<>() {
      @Override public int compare(Course p1, Course p2) {
        return Integer.compare(p1.getGrade(), p2.getGrade());
      }
    });

    // Print the list of courses sorted by grade
    System.out.println("List of courses sorted by grade:");
    for (Course course : courses) {
      System.out.println(course);
    }
  }
}
