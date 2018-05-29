public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        if(A == null || A.isEmpty()){
        	return 0;
    	}
    	int count =0;
    	int currentCount = count;
    	int strLength = A.length();
    	for(int i=0;i<strLength;i++){
    		if(A.charAt(i)==' '){
    			currentCount = 0;
    			continue;
    		}else{
    			currentCount++;
    		}
    		if(currentCount>0){//TO return correct result if String ends with space
    			count = currentCount;
    		}
    	}
    	return count;
    }
}

