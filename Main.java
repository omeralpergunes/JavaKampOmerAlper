package oaghomework1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java&React","Engin Demiroð","2 Ay");
		Course course2 = new Course(2, "AngularC#", "Engin Demiroð", "1 Ay");
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.title);
			
		}
	
		System.out.println(courses.length);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.update(course2);
		courseManager.remove(course2);
		
		Educator educator = new Educator();
		educator.id=1;
		educator.name="Engin Demirog";
		
		System.out.println(educator.name);
		
		
		
	}

}
