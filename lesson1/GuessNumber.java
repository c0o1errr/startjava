public class GuessNumber {
    public static void main (String [] args) {
        int PlayerNumber = 124;
        int ComputerNumber = 214;

        while (PlayerNumber != ComputerNumber) {
            if (PlayerNumber > ComputerNumber) {
                int guess = PlayerNumber--;
                System.out.println(" Number more " + guess);
            } else if  (PlayerNumber < ComputerNumber) {
                int guess = PlayerNumber++;
                System.out.println(" Number less " + guess);
            }           
            
        }
        System.out.println(" Right! Guessed number = " + ComputerNumber);
    }
}