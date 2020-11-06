import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    int t;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      String s = br.readLine();
      StringTokenizer st = new StringTokenizer(s);

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      bw.write((a+b) + "\n");
    }

    bw.flush();
    bw.close();
  }

}
