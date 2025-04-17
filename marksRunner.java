public class marksRunner {
    public static void main(String[] args) {
        
        EncapsulatedMarks student1 = new EncapsulatedMarks();
        student1.setMaths(67);
        student1.setScience(92);
        student1.setEnglish(78);

        student1.setMaths(-5); 
        //get marks usong getter
        System.out.println("Maths: " + student1.getMaths());
        System.out.println("Science: " + student1.getScience());
        System.out.println("English: " + student1.getEnglish());
    }
}
