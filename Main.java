import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

/*
    9개의 수를 배열에 받고
    7개의 합이 100이 되어야하기 때문에
    전체를 더한 뒤 2개를 빼서 100을 맞춘다.
    이중 반복문을 사용해서 전체 sum에서 2개를 빼면서 100이 되는 값을 찾아본다.
*/
    static int[] arr = new int[9];
    static int eight = 0, nine = 0;
    static int sum = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(sum - arr[i] - arr[j] == 100){
                    eight = arr[i];
                    nine = arr[j];
                    printR();
                    return;
                }
            }
        }
    }
    static void printR(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != eight && arr[i] != nine){
                System.out.println(arr[i]);
            }
        }
    }
}
