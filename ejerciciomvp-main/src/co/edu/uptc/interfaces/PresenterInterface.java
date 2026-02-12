package co.edu.uptc.interfaces;

public interface PresenterInterface {

    public void setView(ViewInterface view);
    public void setModel(ModelInterface model);

    void onCalculateRequested(String strNumber1, String strNumber2);

}
