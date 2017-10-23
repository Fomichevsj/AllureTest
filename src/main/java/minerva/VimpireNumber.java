package minerva;

/**
 * Created by User on 16.10.2017.
 */
public class VimpireNumber {

    private static boolean[] busy;
    private static int[] digits;

    private static int findFirstFree(boolean[] busy) {
        for (int i =0; i < busy.length; i++) {
            if(busy[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        busy = new boolean[]{true, true, true, true};
        digits = new int[4];

        for(int n = 1000; n <= 1005; n++) {
            digits[0] = (int) (n/1000);// Взять первую цифру числа
            digits[1] = (int) ( (n - digits[0]*1000)/100);// Получить вторую цифру
            digits[2] = (int)((n - digits[0]*1000 - digits[1]*100)/10);// Получить третью цифру
            digits[3] = n%10;// Получить четвертую циифу

            System.out.println("Число " + n);
            System.out.println("цифра 1: " + digits[0]);
            System.out.println("цифра 2: " + digits[1]);
            System.out.println("цифра 3: " + digits[2]);
            System.out.println("цифра 4: " + digits[3]);
            System.out.println("----------");

            for(int i = 0; i<= 3; i++) {
                int t1 = findFirstFree(busy);
                busy[t1] = false;
                for(int j =0; j<= 2; j++) {
                    int t2 = findFirstFree(busy);
                    busy[t2] = false;
                    for(int k = 0; k<= 1; k++) {
                        int t3 = findFirstFree(busy);
                        busy[t3] = false;
                        for(int l = 0;l <= 0; l++) {
                            int t4 = findFirstFree(busy);
                            busy[t4] = false;
                            /*do something */
                            System.out.println("Получившееся число: " +
                            digits[t1] + digits[t2] + digits[t3] + digits[t4]);
                            busy[t4] = true;
                        }
                        busy[t3] = true;
                    }
                    busy[t2] = true;
                }
                busy[t1] = true;
            }
        }
    }
}
