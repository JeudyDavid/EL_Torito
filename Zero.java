import java.util.Random;

public class Zero {
    public static void main(String args[])
    {
        String [] arr = {"mort", "Melancolie", "horreur", "tristesse", "peur"};
        Random random = new Random();

        int select = random.nextInt(arr.length);

        System.out.println( arr[select]);
    }
}