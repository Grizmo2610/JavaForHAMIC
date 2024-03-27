package oop;

public class Student extends People {
	private final int ID; // student id
	private final String MAJOR; // example: Data Science
	private final int COURSE; // example: 68 = K68
	private double gpa = 0;
	private double studyHour;

	public Student(String name , String id , int age , int ID , String MAJOR , int COURSE) {
		super(name , id , age);
		this.ID = ID;
		this.MAJOR = MAJOR;
		this.COURSE = COURSE;
	}

	public int getID() {
		return ID;
	}

	public String getMAJOR() {
		return MAJOR;
	}

	public int getCOURSE() {
		return COURSE;
	}

	/**
	 * This method increases the number of study hours for students.
	 *
	 * @param hour The time students have spent studying before the exam
	 */
	public void study(int hour){
		/*TODO*/
	}

	/**
	 * This method check if can student pass all the exam
	 *
	 * @param hours The minimum study time required for each course a
	 *              student has registered for in order to pass.
	 *
	 * @return true if student can pass all the exam
	 */
	public boolean pass(int[] hours){
		/*TODO*/
		return false;
	}

	/**
	 * This method deducts the corresponding study time of the subjects
	 * from the minimum study time list. The program stops when the study
	 * time is less than or equal to 0.
	 * <p>
	 * The formula for calculating grades based on a 4-point scale applied
	 * here is as follows:
	 * Grade = coefficient * minimum study time (with the coefficient being
	 * self-determined.)
	 * <p>
	 * Suppose that each subject carries 3 credit.
	 * @param hours the minimum study time required for each course a
	 *              student has registered for in order to pass.
	 * @param portion The ratio of study time before the exam that
	 *                students have allocated to each respective subject.
	 */
	public void test(int[] hours, int[] portion){
		/*TODO*/
	}

	/**
	 * This method check if student can get scholarship or not
	 *
	 * @return true if 'GPA' > 3.5 and studyHour left > 1
	 */
	public boolean getScholarship(){
		/*TODO*/
		return false;
	}

	@Override
	public String toString() {
		return "Student{" +
				"ID=" + ID +
				", MAJOR='" + MAJOR + '\'' +
				", COURSE=" + COURSE +
				", gpa=" + gpa +
				", studyHour=" + studyHour +
				'}';
	}
}
