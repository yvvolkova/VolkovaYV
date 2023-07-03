package hierarchy.operation;

import java.util.ArrayList;

public class Journal {
    private ArrayList<Operation> operations;

    public Journal(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }
}
