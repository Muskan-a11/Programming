import java.util.*;
class gcd{
    public static int Gcd(int a,int b){
        if (b==0){
            return a;
        }
        return Gcd(b,a%b);
    }
    public static int findGcd(int[] nums){
                int result = nums[0];
                for(int  i =1;i< nums.length;i++){
                    result = Gcd(result,nums[i]);
                }
                return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        int[] nums = new int[n];
        //read the integers
        for(int i = 0;i< n;i++){
            nums[i] = sc.nextInt();
        } 
        System.out.println(findGcd(nums));
        sc.close();
    }
}