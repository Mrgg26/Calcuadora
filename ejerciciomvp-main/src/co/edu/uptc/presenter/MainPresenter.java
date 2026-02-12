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
            int n1 = Integer.parseInt(strNumber1);
            int n2 = Integer.parseInt(strNumber2);

            int result = model.exec(n1, n2);

            view.showResult(result);

        } catch (NumberFormatException e) {
            view.showError("Formato inválido: Por favor ingrese solo números enteros.");
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}