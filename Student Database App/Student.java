public class Student{
    //class variables
    private String name;
    private int uniqueID;
    private int gradeLevel;
    private String coursesEnrolled;
    private int tuitionBalance;
    private int courseCost = 600;

    //constructor: prompt for name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        this.name = in.nextLine();
        System.out.println("Enter Student Grade Level: 1=Freshman, 2=Sophomore, 3=Junior, 4=Senior");
        this.gradeLevel = in.nextInt();
    }

    //create 5-digit unique ID(first number = grade level)

    //enroll in courses

    //view balance
    
    //pay tuition

    //method to see student status: name, ID, courses enrolled, balance

    
}