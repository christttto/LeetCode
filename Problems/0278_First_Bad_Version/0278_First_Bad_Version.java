/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //find in bs
        int increment=n/2;
        while(increment>1){
            increment=increment/2;
            if(isBadVersion(n/2)){
                n = n/2+increment;
                
            }
        }
    }
}
