public class EncapsulatedStudent {
    private String name;
    private int[] resultArray;
    //array to store 5 subject  maarks

    //paramterized constrictor
    EncapsulatedStudent(String name, int[] resultArray){
        this.name = name;

        //validate and copy tthe array to ensure exactly 5 subjects
      
        if(resultArray != null && resultArray.length ==5){
            this.resultArray = new int[5];
            System.arraycopy(resultArray, 0, this.resultArray, 0, 5);

        }else{
            System.out.println("Error: Result array must contain exactly 5 subjects");
            //initilize wih default values
            this.resultArray = new int[5];
        }
    }
    //method to calculate and return average marks
    public double average(){
        int sum = 0;
        for(int mark : resultArray){
            sum +=mark;
        }return (double) sum / resultArray.length;
    }
    //geter for name
    public String getName(){
        return name;
    }
    //getter for result array(returns a copy to maintain encapsulation)
    public int[] getResultArray(){
        int[] copy = new int[5];
        System.arraycopy(resultArray,0 ,copy, 0, 5);
        return copy;
    }
}
