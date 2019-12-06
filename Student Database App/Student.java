public class Student{
    //class variables
    private String name;
    private String uniqueID;
    private int gradeLevel;
    private String coursesEnrolled;
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    //constructor: prompt for name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        this.name = in.nextLine();
        System.out.println("Enter Student Grade Level: 1=Freshman, 2=Sophomore, 3=Junior, 4=Senior");
        this.gradeLevel = in.nextInt();
        generateStudentID();
        System.out.println(this.name + " " + this.gradeLevel + " " + uniqueID);
        enroll();
    }

    //create 5-digit unique ID(first number = grade level)
    private String generateStudentID(){
        id++;
        return gradeLevel + "" + id;
    }
    //enroll in courses
    public void enroll(){
        do{
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                coursesEnrolled = coursesEnrolled + "/n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            }else{ 
                break; 
            }
        }while (1 != 0);

        System.out.println("Enrolled In: " + coursesEnrolled);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }
    //view balance
    
    //pay tuition

    //method to see student status: name, ID, courses enrolled, balance

    
}