package co.edu.uptc.view;

import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;

import java.util.Scanner;



public class ConsoleView implements ViewInterface {
    private PresenterInterface presenter;
    private Scanner scanner;
    private boolean isRunning;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
    }

    @Override
    public void setPresenter(PresenterInterface presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showResult(byte result) {
        System.out.println("--------------------------------");
        System.out.println("Suma realizada con éxito.");
        System.out.println("EL RESULTADO ES: " + result);
        System.out.println("--------------------------------");
    }

    @Override
    public void showError(String message) {
        System.out.println(">>>> ERROR: " + message);
    }

    @Override
    public void start() {
        System.out.println("===  SISTEMA DE SUMA (MVP) ===");

        while (isRunning) {
            System.out.println("\nEscriba 'salir' para finalizar o presione Enter para sumar:");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("salir")) {
                isRunning = false;
                System.out.println("Saliendo del programa...");
            } else {
                readInfo();
            }
        }
    }

    private void readInfo() {
        System.out.print("Ingrese el primer número: ");
        String n1 = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String n2 = scanner.nextLine();

        presenter.onCalculateRequested(n1, n2);
    }
}



