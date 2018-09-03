public class GuessNumber {
	public static void main (String [] args)  {
		int guess =  56; // загаданное число
		int rand = 50;	// случайное число
        int newNumber=0;

		while (guess != rand) {
            if (guess > rand) {
                newNumber = guess --;
            	System.out.println ("Chislo 6oJIbIIIe " + newNumber);
                //break;
            }
            else {
                newNumber = guess ++;
            	System.out.println ("Chislo menbwe " + newNumber);
                //break;
            }                    
        }
        if (guess == rand){
        System.out.println ("Ugadal");						
	   }
    }
}