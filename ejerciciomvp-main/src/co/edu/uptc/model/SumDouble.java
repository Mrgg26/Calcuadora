package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;

public class SumDouble implements ModelInterface {

    @Override
    public String exec(String number1, String number2) throws Exception {

        if (number1 == null || number2 == null ||
                number1.isEmpty() || number2.isEmpty()) {
            throw new Exception("Los campos no pueden estar vacíos.");
        }

        try {
            double n1 = Double.parseDouble(number1);
            double n2 = Double.parseDouble(number2);

            return Double.toString(n1 + n2);

        } catch (NumberFormatException e) {
            throw new Exception("Debe ingresar números válidos entre (±1.7E308).");
        }
    }
}


