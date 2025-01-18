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
        System.out.println("*****************************************************************************");
        System.out.println("*                               SYMBOL TABLE                                *");
        System.out.println("*****************************************************************************");
        System.out.println("| ID | Variable Name   | Value                                              |");
        System.out.println("*****************************************************************************");

        int id = 1;
        for (Row row : rows) {
            if (row != null) {
                System.out.printf("| %-2d | %-15s | %-50s |\n", id, row.getType(), row.getValue());
                id++;
            }
        }

        System.out.println("*****************************************************************************");
    }
}
