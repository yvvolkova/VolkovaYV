package hierarchy.operation;

import hierarchy.Emmitent;

public class Operation {
    private OperType operType;
    private String name;
    private Emmitent emmitent;

    public Operation(OperType operType, String name, Emmitent emmitent) {
        this.operType = operType;
        this.name = name;
        this.emmitent = emmitent;
    }

    public OperType getOperType() {
        return operType;
    }

    public String getName() {
        return name;
    }

    public Emmitent getEmmitent() {
        return emmitent;
    }

    public void setOperType(OperType operType) {
        this.operType = operType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmmitent(Emmitent emmitent) {
        this.emmitent = emmitent;
    }
}
