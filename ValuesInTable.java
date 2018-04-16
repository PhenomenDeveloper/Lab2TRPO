package Laba2;

import java.util.List;

public class ValuesInTable {

        private List<Object> columnNames;

        private List<Object> columnTypes;

        private List<Object> columnUnits;

        private List<List<Object>> rows;

    public List<Object> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<Object> columnNames) {
        this.columnNames = columnNames;
    }

    public List<Object> getColumnTypes() {
        return columnTypes;
    }

    public void setColumnTypes(List<Object> columnTypes) {
        this.columnTypes = columnTypes;
    }

    public List<Object> getColumnUnits() {
        return columnUnits;
    }

    public void setColumnUnits(List<Object> columnUnits) {
        this.columnUnits = columnUnits;
    }

    public List<List<Object>> getRows() {
        return rows;
    }

    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }


    public void addColumnName(Object columnNames) {
        this.columnNames.add(columnNames);
    }


    public void addColumnType(Object columnTypes) {
        this.columnTypes.add(columnTypes);
    }


    public void addColumnUnit(Object columnUnits) {
        this.columnUnits.add(columnUnits);
    }


    public void addRow(List<Object> rows) {
        this.rows.add(rows);
    }


}
