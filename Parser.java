package Laba2;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) throws IOException {


        Table table = JSON.parseObject(readFile(), Table.class);

        List<List<Object>> rows = table.getTable().getRows();
        List<Object> Max = rows.get(0);
        List<Object> Min = rows.get(0);

        String whatSearch = "current_speed";
        Demonstrator Current_speed = new Demonstrator(table.getTable().getRows().get(0), whatSearch, table.getTable().getColumnNames());
        whatSearch = "temperature";
        Demonstrator Temperature = new Demonstrator(table.getTable().getRows().get(0), whatSearch, table.getTable().getColumnNames());
        whatSearch = "salinity";
        Demonstrator Salinity = new Demonstrator(table.getTable().getRows().get(0), whatSearch, table.getTable().getColumnNames());


        for (List<Object> i : rows) {
            Current_speed.findObject(i);
            Temperature.findObject(i);
            Salinity.findObject(i);

        }

        System.out.println(Current_speed);
        System.out.println(Temperature);
        System.out.println(Salinity);



    }

    public static String readFile() throws IOException {
        String fileName = "src/Laba2/file.json";

        Scanner scanner = new Scanner(Paths.get(fileName));
        String s;
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            builder.append(s).append('\n');
        }
        return builder.toString();

    }
}
