package Harmonious;

public class Harmonious {
    int i = 0 ;
    int min= Integer.MAX_VALUE ;
    int max= Integer.MIN_VALUE ; 
      while(i<nums.length)
  {
         if(min>nums[i])
         {
             min1=i;
             min=nums[i];
         }
         if(max<=nums[i])
         {
             max1=i;
             max=nums[i];
         }
         if((max-min)>1)
         {
             min1++;
             min=nums[min1];
         }
         else if((max-min)<1)
         {
          i++;
         }
         else{
             lhs=Math.max(lhs,(max1-min1)+1);
             i++;
              }
           
  }
  return lhs<0 ? 0 : lhs;

}
