
import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    int[] marks = new int[3];

    Student(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Student name: ");
name = sc.nextLine();

System.out.println("Enter roll number: ");
rollNo = sc.nextInt();

for(int i = 0; i<3; i++){
    System.out.println("Enter marks for students: " + (i + 1) + ":");
    marks[i] = sc.nextInt();
}
    }
public int getTotalMarks(){
int sum =0;
for(int i : marks){
    sum += i;
}return sum;
}

public double getAverage(){
    return(double) getTotalMarks() / marks.length;
}
public void displayInfo(){
    System.out.println(" Name " + name);
    System.out.println(" Roll Number " + rollNo);
    for(int i =0; i<3; i++){
        System.out.println("subjects" + (i+1) + "marks:" + marks[i]);
    }
    System.out.println("total marks is " + getTotalMarks());
    System.out.println("average marks is " + getAverage());
}

}

public class StudentRecordSystem {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.displayInfo();
    }
}
