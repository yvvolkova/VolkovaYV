package hierarchy;
import java.util.ArrayList;

public class Emmitent {
    private String name;
    private Emmitent emmitent;
    private Stock stock;
    private ArrayList<Market> marketList;

    public Emmitent(String name, Emmitent emmitent, Stock stock, ArrayList<Market> marketList) {
        this.name = name;
        this.emmitent = emmitent;
        this.stock = stock;
        this.marketList = marketList;
    }

    public String getName() {
        return name;
    }

    public Emmitent getEmmitent() {
        return emmitent;
    }

    public Stock getStock() {
        return stock;
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmmitent(Emmitent emmitent) {
        this.emmitent = emmitent;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
}
