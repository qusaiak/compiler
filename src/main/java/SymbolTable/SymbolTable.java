package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void addRow(Row row) {
        this.rows.add(row);
    }

    public void print() {
        System.out.println("TYPE" + "\t\t\t\t\t" + "VALUE");
        for (Row row : rows) {
            if (row != null) {
                System.out.println(row.getType() + "\t\t\t\t" + row.getValue());
            }
        }
    }
}
