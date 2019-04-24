/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int answer = n;
        int offset = n/2;
        while(guess(answer)!=0){
            //lower
            if(guess(answer)==-1){
                answer-=offset;
            }
            //higher
            else{
                answer+=offset;
            }
            offset=(int)Math.ceil(offset/2.0);
        }
        return answer;
    }
}