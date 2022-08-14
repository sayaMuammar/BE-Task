
package ebdeskbetechnicaltask;


public class ProblemSolving1 {
    
    
    public static void main(String[] args) {
        
        
     int nums[] = {3,7,12};
     int target = 15;
     if(nums[0]+nums[1]== target){
         System.out.println(0+", "+1);
     }
     else if (nums[1]+nums[2]== target){
         System.out.println(1+", "+2);
     }
     else if (nums[2]+nums[3]== target){
         System.out.println(2+", "+3);
     }
     else if (nums[0]+nums[3]== target){
         System.out.println(0+", "+3);
     }
     else if (nums[0]+nums[2]== target){
         System.out.println(0+", "+2);
     }
     else if (nums[1]+nums[3]== target){
         System.out.println(2+", "+3);
     }
     else{
         System.out.println("target tidak cocok");
     }
    }
}
