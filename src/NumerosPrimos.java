import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    public List<Integer> generarPrimos (int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                        esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                list.add(i);
            }
        }
        return list;
    }
}
