public class stream {
    public static void main(String[] args) {
        
        boolean a_1 = true;
        boolean b_1 = false;
        boolean result_1 = a_1 && b_1; // result bude false
        System.out.println(result_1); 
        boolean result_4 = a_1 & b_1;
        System.out.println(result_4);
        
        boolean result_2 = a_1 || b_1; // result bude true
        System.out.println(result_2);
        boolean result_5 = a_1 | b_1;
        System.out.println(result_5);

        boolean result_3 = !a_1; // result bude false
        System.out.println(result_3);

        boolean result_6 = a_1 ^ b_1; // result bude true
        System.out.println(result_6);
  
    }
    
}
