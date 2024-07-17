public class Recursion1 {
    //Entering into infinite loop
    static void show() {

        System.out.println("Hi Girls !");
        show();
    
}
    public static void main(String args[]) {

        show();
        
    }
    
}
