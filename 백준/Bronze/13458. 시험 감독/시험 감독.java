import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long answer = 0;

        answer += n;

        for (int i = 0; i < n; i++) {
            arr[i] -= b;
            if (arr[i] <= 0) continue;
            answer += arr[i] / c;
            if (arr[i] % c != 0) {
                answer++;
            }
        }
        System.out.println(answer);
	}

}