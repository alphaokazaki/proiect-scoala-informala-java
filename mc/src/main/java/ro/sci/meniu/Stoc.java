package ro.sci.meniu;

/**
 * Created by Skipy on 07/06/2017.
 */
public class Stoc extends AbstractModel{
    private int nrCrt, stocCurent, stocCritic;
    private String ingredienta, uM, gamaIngedienta;

    public int getNrCrt() {
        return nrCrt;
    }

    public void setNrCrt(int nrCrt) {
        this.nrCrt = nrCrt;
    }

    public int getStocCurent() {
        return stocCurent;
    }

    public void setStocCurent(int stocCurent) {
        this.stocCurent = stocCurent;
    }

    public int getStocCritic() {
        return stocCritic;
    }

    public void setStocCritic(int stocCritic) {
        this.stocCritic = stocCritic;
    }

    public String getIngredienta() {
        return ingredienta;
    }

    public void setIngredienta(String ingredienta) {
        this.ingredienta = ingredienta;
    }

    public String getuM() {
        return uM;
    }

    public void setuM(String uM) {
        this.uM = uM;
    }

    public String getGamaIngedienta() {
        return gamaIngedienta;
    }

    public void setGamaIngedienta(String gamaIngedienta) {
        this.gamaIngedienta = gamaIngedienta;
    }

    @Override
    public String toString() {
        return "Stoc{" +
                "nrCrt=" + nrCrt +
                ", stocCurent=" + stocCurent +
                ", stocCritic=" + stocCritic +
                ", ingredienta='" + ingredienta + '\'' +
                ", uM='" + uM + '\'' +
                ", gamaIngedienta='" + gamaIngedienta + '\'' +
                '}';
    }
}
