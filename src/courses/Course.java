package courses;

/**
 * This class represents a course. The course has a name and a final grade.
 */
public class Course {
  private final String name;
  private final int grade;

  /**
   * Constructs a Course object and initializes it to the given name and grade.
   *
   * @param name  the name of the course
   * @param grade the final grade of the course
   */
  public Course(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  /**
   * Get the name of the course.
   *
   * @return the name of the course
   */
  public String getName() {
    return this.name;
  }

  /**
   * Get the final grade of the course.
   *
   * @return the final grade of the course
   */
  public int getGrade() {
    return this.grade;
  }

  @Override public String toString() {
    return this.getName() + ": " + this.getGrade();
  }
}
