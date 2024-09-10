import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 /*
 나이, 가입시기를 비교해야하기 때문에 2차원 배열을 받은 후 sort한다.
*/
public class Main {
    public static void main(String[] args) throws IOException {
 
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[][] list = new String[N][2];
        for (int i = 0; i < N; i++) {
			list[i][0] = in.next();
			list[i][1] = in.next();
        }
 
        Arrays.sort(list, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
 
		for (int i = 0; i < N; i++) {
			System.out.println(list[i][0] + " " + list[i][1]);
		}
    }
}