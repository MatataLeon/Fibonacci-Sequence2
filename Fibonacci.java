import com.shpp.cs.a.console.TextProgram;

public class Fibonacci extends TextProgram {
    public void run() {
        int number = readInt("Enter number of Sequence: ");
        long fa = 0;
        long fb = 1;
        long res;
        for (int i = 0; i <= number; i++) {
            System.out.println("F" + i + " = " + fa);
            res = fa + fb;
            fa = fb;
            fb = res;
        }
    }
}
