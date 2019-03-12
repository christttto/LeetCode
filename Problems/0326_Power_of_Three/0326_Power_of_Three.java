class Solution {
    public boolean isPowerOfThree(int n) {
        //first, with the loop
        int poweredThree=3;
        while(poweredThree<=n){
            System.out.println(poweredThree);
            if(poweredThree==n)return true;
            poweredThree *=3;
        }
        return false;
        //3, 9, 27, 81, 243, 729, 7
        //3, 9, 7, 1, 3, 9, 7
        //sum of the digits divides to be divisible by 3
        //maybe 9?
        //
        //what about 33, 45, 63
        //657=
    }
}