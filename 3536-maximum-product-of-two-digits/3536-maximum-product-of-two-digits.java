/*class Solution {
    public int maxProduct(int n) {
        int max1 = -1 , max2 = -1;
        while(n != 0){
            int rem = n % 10;
            if(max1 <= rem){
                max2 = max1;
                max1 = rem;
            }
            else if(max2 < rem){
                max2 = rem;
            }
            n /= 10;
        }
        return max1 * max2;
    }
}*/

class Solution {
    public int maxProduct(int n) {
        int max = -1;
        String str = n + "";
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i + 1 ; j < str.length() ; j++){
                int d1 = str.charAt(i) - '0';
                int d2 = str.charAt(j) - '0';
                max = Math.max(max , d1 * d2);
            }
        }
        return max;
    }
}