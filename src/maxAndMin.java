import java.util.Random;
public class maxAndMin {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randArray = new int [10];
        int max = 0;
        int min = 200;

        for (int i =0; i<= 9;i++) {
    int num = rand.nextInt(200)+1;
randArray [i] = num;
  if (randArray [i] > max )
  {max = randArray [i];
  }
if (randArray [i] < min ) {
    min = randArray[i];
}
    System.out.print(randArray[i]+" ");
}

        System.out.println("\n max = " + max);
        System.out.println(" min = " + min);
}
}



