package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;

public class MainPresenter implements PresenterInterface {
    private ViewInterface view;
    private ModelInterface model;

    public void SumPresenter(ViewInterface view, ModelInterface model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void setView(ViewInterface view) {
        this.view = view;
    }

    @Override
    public void setModel(ModelInterface model) {
        this.model = model;
    }

    @Override
    public void onCalculateRequested(String strNumber1, String strNumber2) {
        try {
            byte n1 = Byte.parseByte(strNumber1);
            byte n2 = Byte.parseByte(strNumber2);

            byte result = model.exec(n1, n2);

            view.showResult(result);

        } catch (NumberFormatException e) {
            view.showError("Formato inválido: Por favor ingrese solo números entre -128 y 127.");
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}