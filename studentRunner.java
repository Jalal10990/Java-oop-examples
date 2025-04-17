public class studentRunner {
    public static void main(String[] args) {
        //create first student
        int[] marks1 = {85, 90, 87, 65,45};
        EncapsulatedStudent student1 = new EncapsulatedStudent("Shah Jalal", marks1);

        // Create second student
        int[] marks2 = {75, 82, 90, 68, 79};
        EncapsulatedStudent student2 = new EncapsulatedStudent("Bob", marks2);

        double avg1 = student1.average();
        double avg2 = student2.average();

        System.out.println(student1.getName() + "'s average: " + avg1);
        System.out.println(student2.getName() + "'s average: " + avg2);

        //compre average
        if(avg1  > avg2){
            System.out.println(student1.getName() + " has higher average than " + student2.getName());
        }else{
            System.out.println("Both students have the same average");

        }
        //Create third student with name from student1 and marks from student2
        EncapsulatedStudent student3 = new  EncapsulatedStudent(student1.getName(), student2.getResultArray());
        System.out.println("\nThird student created:");
        System.out.println("Name: " + student3.getName());
        System.out.println("Average: " + student3.average());
    }
}
