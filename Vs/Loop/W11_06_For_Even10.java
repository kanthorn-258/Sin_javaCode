package Loop;

public class W11_06_For_Even10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 2; count <= 20; count+=2) {
            sum = sum + count;

            if (count<20){
                System.out.print(count+" + ");
            }else {
                System.out.print(count+" = " +sum);
            }
        }
    }
    }

