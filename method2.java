public class method2{
    public static void main(String[] args){
        int result1 = add(5,3);
        int result2 = add(10,20);

        printResult(result1);
        printResult(result2);        
    } 

    public static int add(int a, int b) {
    return a + b;
    }
    
    public static void printResult(int result) {
        System.out.println(result);
    }
    
}
