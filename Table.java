package Laba2;

public class Table {

        private ValuesInTable table;

        public ValuesInTable getTable() {
            return table;
        }

        public void setTable(ValuesInTable table) {
            this.table = table;
        }

        @Override
        public String toString() {
            return "tableOUT{" +
                    "table=" + table +
                    '}';
        }


    }


