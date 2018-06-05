public class Solution {
    public int colorful(int A) {
        String numString = String.valueOf(A);
        int len = numString.length();
        if(len==1)
            return 1;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=1;i<=len;i++){
            for(int j=0; j+i<=len;j++){
                String subString = numString.substring(j,j+i);
                int product = product(subString);
                if(set.contains(product)){
                    return 0;
                } else {
                    set.add(product);
                }
            }
        }
        return 1;
    }
    
    public int product(String subString){
        
        int num = Integer.parseInt(subString);
        if (num<10)
            return num;
        int product = 1;
        while(num>0){
            product = product * (num%10);
            num = num/10;
        }
        return product;
        
    }
}
