class Solution{
    public int[]plusOne(int[]digits){
       intndigits.length;
        for(inti-n-1;i>-0;i--){
            if(digits[i]<9){
               digits[i]++;
                return digits;
           }
            digits[i]=0;
	}
       int[]new_number=new int[n+1];
       new_number[0]=1;
       return new_number;
   }
}