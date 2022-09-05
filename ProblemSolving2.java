
package ebdeskbetechnicaltask;


public class ProblemSolving2 {
    
    
    public static void main(String[] args) {
        
    int x = 1234321;
    
    int reverse = 0; 
    int temp = x;
    
        while(x != 0){    
        
        int remainder = x % 10;  
        reverse = reverse * 10 + remainder;  
        x = x/10;  
    
    }  
        if(temp == reverse){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
   
    }
}
    
    
