
package ebdeskbetechnicaltask;


public class ProblemSolving1 {
    
    
    public static void main(String[] args) {
        
        
     int[] nums = {2, 5, 13, 15};
        int target = 7;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[ " + i +", " + j + " ]");
                }
            }
        }
    }
}
