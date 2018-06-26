public class Solution {
    public ArrayList<Integer> stepnum(int A, int B) {
  
         ArrayList<Integer> res = new ArrayList<Integer>();
        //May be better approach is to start creating all stepping numbers starting
        //from A and verify if they are between A and B
        for(int i=A;i<=B;i++){
            if(isSteppingNumber(i))
                res.add(i);
        }
        return res;
    }
    
    public boolean isSteppingNumber(int num){
        if(num<10)
            return true;
        int rem1=num%10,rem2=0;
        num = num/10;
        while(num>0){
            rem2 = (num)%10;
            if(Math.abs(rem1-rem2)!=1)
                return false;
            num = num/10;
            rem1=rem2;
            
        }
        return true;
    }
}

