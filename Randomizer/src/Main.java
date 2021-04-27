
import java.util.*;
public class Main {

    public static double rand(int size, int count)
    {


        int group[] = new int[size];
        int t;
        int r=0;
        Random rand = new Random();

        for(int a=0; a<count; a++) {
            for (int i = 0; i < size; i++) {
                group[i] = rand.nextInt(365);

            }

            t = 0;
            //System.out.println(t);
            for (int i = 0; i < group.length; i++) {
                for (int j = i + 1; j < group.length; j++) {
                    if (group[i] == group[j]) {
                        t++;
                    }
                }
            }

            if (t > 0) {
                r++;
            }
        }

        double result = (r*100.0)/count;
        return result;

    }

    public static void main(String[] args) {


        double r1 = rand(20, 10000);
        System.out.println(r1);










    }


    }

