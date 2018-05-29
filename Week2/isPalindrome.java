public class Solution {
    public int isPalindrome(String A) {
    	int False = 0;
    	int True = 1;
    	if(A == null || A.isEmpty())
    		return False;
    	A = A.toLowerCase();
    	char [] charArray = A.toCharArray();
    	int i=0, j = charArray.length-1; 
    	char left = charArray[i], right = charArray[charArray.length-1];
    	while(i<j){
    		left = charArray[i];
    		right = charArray[j];
    		//Updating left or right to find correct char
    		if(!((left>='a' && left<='z') || (left>='0' && left<='9')) ){
    			i++;
    			continue;
    		}
    		if(!((right>='a' && right<='z') || (right>='0' && right<='9'))){
    			j--;
    			continue;
    		}
    		if(left!=right){
    			return False;
    		}
    		i++;
    		j--;
    	}
    	return True;
    }
}

