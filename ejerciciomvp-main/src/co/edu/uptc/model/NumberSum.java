package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;

public class NumberSum implements ModelInterface {

        @Override
        public byte exec(byte number1, byte number2) throws Exception {
            if (number1 < 0 || number2 < 0) {
                throw new Exception("Error del Modelo: Solo se permiten números positivos.");
            }

            int result = number1 + number2;

            if (result > Byte.MAX_VALUE || result < Byte.MIN_VALUE) {
                throw new Exception("Error del Modelo: El resultado excede la capacidad de un byte.");
            }

            return (byte) result;
        }

}
