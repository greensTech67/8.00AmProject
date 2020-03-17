package cts.proj.modu;

//Class
public class CourseDetails {

	// Methods
	private void seleniumCourse() {

		System.out.println("Seleium");

	}

	private void javaCourse() {
		System.out.println("Java");

	}

	private void javaCourse2() {
		System.out.println("Java");

	}

	private void javaCourse3() {
		System.out.println("Java");

	}

	// Main Method
	public static void main(String[] args) {
		// Object >> Run Time Memory Allocation (RAM - Heap Memory)

		// ClassName objectName/RefName = new ClassName();

		CourseDetails object = new CourseDetails();

		object.seleniumCourse();
		object.javaCourse();
		
		System.out.println("NEw Code");

	}

}
