package by.it.sinkevich.jd01_09.variables;

/**
 * Created by Computer on 16.05.2016.
 *
 * @author Sinkevich Denis
 */
public class MathLabVector extends MathLabVariable {

    private Double[] value;

    public MathLabVector() {
        value = new Double[5];
    }

    public MathLabVector(int size) {
        if (size > 0) {
            value = new Double[size];
        } else {
            System.out.println("Размерность вектора меньше нуля");
        }
    }

    public MathLabVector(Double[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String result = "{";
        for (int i = 0; i < value.length; i++) {
            if (i != value.length - 1) {
                String formatStr = String.format("% 5.2f,", value[i]);
                result = result.concat(formatStr);
            } else {
                String formatStr = String.format("% 5.2f}", value[i]);
                result = result.concat(formatStr);
            }
        }
        return result;
    }

}
