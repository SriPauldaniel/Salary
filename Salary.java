import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int n=0;
        for(int i=0;i<7;i++) {
            arr[i] = sc.nextInt();
            n += arr[i];
        }
        int sal = 0;
        if(n > 40) {
            sal = (n*100) + ((n-40)*25);
            System.out.println(sal);
        } else {
            for(int i=0;i<7;i++) {
                if(i == 0) {
                    sal += (arr[i] * 150);
                } else if(i == 6) {
                    sal += arr[i] * 125;
                } else if(arr[i] < 8) {
                    sal += arr[i] * 100;
                } else {
                    sal += (arr[i] * 100) +((arr[i]-8) * 15);
                }
            }
            System.out.println(sal);
        }
        sc.close();
    }
}