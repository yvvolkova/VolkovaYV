package hierarchy;

import hierarchy.operation.Currency;

import java.util.ArrayList;

public class Market {
    private String name;
    private ArrayList<Currency> currencyList;
    private Emmitent emmitent;

    public Market(String name, ArrayList<Currency> currencyList, Emmitent emmitent) {
        this.name = name;
        this.currencyList = currencyList;
        this.emmitent = emmitent;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Currency> getCurrencyList() {
        return currencyList;
    }

    public Emmitent getEmmitent() {
        return emmitent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrencyList(ArrayList<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public void setEmmitent(Emmitent emmitent) {
        this.emmitent = emmitent;
    }
}
