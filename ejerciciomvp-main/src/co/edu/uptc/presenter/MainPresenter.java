package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;

public class MainPresenter implements PresenterInterface {

    private ViewInterface view;
    private ModelInterface model;

    public MainPresenter() {
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
            String result = String.valueOf(model.exec(strNumber1, strNumber2));
            view.showResult(String.valueOf(result));

        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}
