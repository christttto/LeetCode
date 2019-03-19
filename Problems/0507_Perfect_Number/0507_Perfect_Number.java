class Solution {
    public boolean checkPerfectNumber(int num) {
        //equal to the sum of all its positive divisor
        //find all divisors
        //try dividing by 1-num, takes O(n)
        //28 = 2 * 2 * 7
        //1,2,4,7,14 = permutation of all the combo
        //find all the prime number that divides, than create combination using the found list.
        //return sum(all divisors)==num
        if(num==1)return false;
        List<Integer> myDivisor = new ArrayList<Integer>();
        myDivisor.add(1);
        int total=1;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                total+=i;
                if(!(num/i==i)) total+=num/i;
            }
        }
        
        return total==num;
    }
}class Solution {
    public boolean checkPerfectNumber(int num) {
        
    }
}
