package Annotations;

public class Driver {
	public static void main(String[] args) {
		Course course = new Course();

		Class<?> cls = course.getClass();
		CourseInfo info = cls.getAnnotation(CourseInfo.class);
		System.out.println(info.courseName());
		System.out.println(info.duration());
	}
}
