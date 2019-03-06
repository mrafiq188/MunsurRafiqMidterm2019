package design;

public abstract class AbstractEmployee implements Employee{

    final String empName = "Bill";
    static String resignationDate = "3/5/2019";

    public void farewell () {
        System.out.println(empName+"'s last day was"+resignationDate);
    }
    public abstract void farewell (int date);

}