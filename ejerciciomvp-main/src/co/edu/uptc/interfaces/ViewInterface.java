package co.edu.uptc.interfaces;

public interface ViewInterface {

    void setPresenter(PresenterInterface presenter);

    void showResult(int result);
    void showError(String message);
    void start();


}
