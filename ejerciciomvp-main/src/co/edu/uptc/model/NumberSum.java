package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;

public class NumberSum implements ModelInterface {

    @Override
    /*public String exec(String number1, String number2) throws Exception {

        if (number1 == null || number2 == null ||
                number1.isEmpty() || number2.isEmpty()) {
            throw new Exception("Los campos no pueden estar vacíos.");
        }

        try {
            byte n1 = Byte.parseByte(number1);
            byte n2 = Byte.parseByte(number2);

             return Byte.toString((byte) (n1 + n2));

        } catch (NumberFormatException e) {
            throw new Exception("Debe ingresar números válidos tipo byte (-128 a 127).");
        }
    }
     */ public String exec(String number1, String number2) throws Exception {

        if (number1 == null || number2 == null ||
                number1.isEmpty() || number2.isEmpty()) {
            throw new Exception("Los campos no pueden estar vacíos.");
        }

        try {
            int n1 = Integer.parseInt(number1);
            int n2 = Integer.parseInt(number2);

            return Integer.toString(n1 + n2);

        } catch (NumberFormatException e) {
            throw new Exception("Debe ingresar números válidos tipo entero.");
        }
    }
}



