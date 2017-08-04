public class Primerange{

    public static void main(String[] args) {

        int low=2, high=6;

        while (low < high) {
            boolean flag=false;

            for(int i = 2; i <= low/2; ++i) {
            if(low % i == 0) {
                  flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
