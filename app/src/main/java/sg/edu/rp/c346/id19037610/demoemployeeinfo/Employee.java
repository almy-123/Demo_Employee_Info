package sg.edu.rp.c346.id19037610.demoemployeeinfo;


public class Employee {
    private String name;
    private String title;
    private double salary;

    public Employee(String name, String title, double salary){
        this.name=name;
        this.title=title;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String n){
        name = n;
    }

    public void setTitle(String t){
        title = t;
    }

    public void setSalary(double s){
        salary = s;
    }

    public String toString(){
        String str = "$"+getSalary();
        return str;
    }
}
