public class Multiply implements Operate {

    @Override
    public Double getResult(Double... numbers) {
        double result = 0.0;
        for (Double num : numbers)
            result *= num;
        return result;
    }
}
