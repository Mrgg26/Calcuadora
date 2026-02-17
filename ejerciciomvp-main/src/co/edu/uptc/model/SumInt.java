package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;

public class SumInt implements ModelInterface {

    @Override
    public String exec(String number1, String number2) throws Exception {

        if (number1 == null || number2 == null ||
                number1.isEmpty() || number2.isEmpty()) {
            throw new Exception("Los campos no pueden estar vacíos.");
        }

        try {
            int n1 = Integer.parseInt(number1);
            int n2 = Integer.parseInt(number2);

            return Integer.toString(n1 + n2);

        } catch (NumberFormatException e) {
            throw new Exception("Debe ingresar números válidos tipo entero (-2 147 483 648 a 2 147 483 647).");
        }
    }
}



