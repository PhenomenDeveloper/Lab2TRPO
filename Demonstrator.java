package Laba2;
import java.util.List;
import java.util.Objects;

public class Demonstrator {

    private List<Object> Min;
    private List<Object> Max;
    private int num_record;
    private String column;
    private float sum;
    private List<Object> search;


    public void findObject(List<Object> i){
        int counter = whatSearch(column, search);
        if( Float.parseFloat(i.get(counter+1).toString()) == 0 ) {
            if ((Float.parseFloat(i.get(counter).toString())) > (Float.parseFloat(Max.get(counter).toString()))) {
                Max = i;
            }
            if ((Float.parseFloat(i.get(counter).toString())) < (Float.parseFloat(Min.get(counter).toString()))) {
                Min = i;
            }

            num_record += 1;
            sum += Float.parseFloat(i.get(counter).toString());
        }
    }



    public Demonstrator(List<Object> temp, String column, List<Object> where) {
        Max = temp;
        Min = temp;
        this.num_record = 0;
        this.column = column;
        this.sum = 0;
        search = where;
    }

    public Demonstrator() {
        this.num_record = 0;
        this.sum = 0;
    }

    public List<Object> getMax() {
        return Max;
    }

    public void setMax(List<Object> max) {
        Max = max;
    }

    public List<Object> getMin() {
        return Min;
    }

    public void setMin(List<Object> min) {
        Min = min;
    }

    public int getNum_record() {
        return num_record;
    }

    public void setNum_record(int num_record) {
        this.num_record = num_record;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }





    public static int whatSearch(String what, List<Object> where){
        int number = -1;
        int counter = 0;
        for (Object i : where) {
            if (Objects.equals(what, i.toString())){
                number = counter;
            }
            counter += 1;
        }
        return number;
    }
    @Override
    public String toString() {
        int counter = whatSearch(column, search);
        return  "    \"" + column + "\": {\n" +
                "       \"start_date\": \"2015-08-15\",\n" +
                "       \"end_date\": \"2016-12-05\",\n" +
                "       \"num_records\": " + num_record + ",\n" +
                "       \"min_" + column + "\": " + Min.get(counter) + ",\n" +
                "       \"min_time\": \"" + Min.get(3) + "\",\n" +
                "       \"max_" + column + "\": " + Max.get(counter) + ",\n" +
                "       \"max_time\": \"" + Max.get(3) + "\",\n" +
                "       \"avg_" + column + "\": " + sum/num_record +
                "\n   }";


    }
}




