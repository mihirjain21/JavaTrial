public class head {
    public static void main(String[] args) {
		// Implement your code here 
        
              //A total of 150 chickens and rabbits, 500 in the cage, find how many chickens and how many rabbits
              //(The number of chickens * 2) + (the number of rabbits * 4) = 500
              //Use a for loop to enumerate all possibilities until if the condition is met.
              int head = 150;
              int foot = 500;
              //because there will not be an odd number of feet,So all use int type
              for (int i = 1; i <= foot / 2; i++) //number of hypothetical chickens
              {
                int rabbit = head - i;//number of rabbits assumed
                if (rabbit * 4 + head * 2 == foot) //When established, it is the correct number of chickens and rabbits.
        //   Output and end the loop directly
                {
                  System.out.println ("The number of chickens is: " + i);
                  System.out.println ("The number of rabbits is: " + rabbit);
                  break;
                }
              }
            }
	}
