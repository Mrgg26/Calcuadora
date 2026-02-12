package co.edu.uptc.interfaces;

public interface ViewInterface {

    void setPresenter(PresenterInterface presenter);

    void showResult(byte result);
    void showError(String message);
    void start();


}
