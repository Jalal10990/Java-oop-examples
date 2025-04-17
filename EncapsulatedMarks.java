class EncapsulatedMarks{
    
    private int maths;
    private int science;
    private int english;

    //setter method to saafly assign value
    public void setMaths(int maths){
        if(maths >=0 && maths <= 100){
            this.maths = maths;
        }else{
            System.out.println("Invalid Maths marks! Must be 0-100.");
        }
    }
    public void setScience(int science){
        if(science >=0 && science <= 100){
            this.science = science;
        }else{
            System.out.println("Invalid Science marks! Must be 0-100.");
        }
    }
    public void setEnglish(int english){
        if (english >= 0 && english <= 100) {
            this.english = english;
        } else {
            System.out.println("Invalid English marks! Must be 0-100.");
        }
    }
    //getter method to safly retrive values
public int getMaths(){
    return maths;
}
public int getScience() {
    return science;
}

public int getEnglish() {
    return english;
}

}