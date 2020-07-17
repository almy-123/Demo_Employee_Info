package sg.edu.rp.c346.id19037610.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.lbEmployeeInfo);

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("John", "Software Technical Leader", 3400.0));
        employeeList.add(new Employee("May", "Programmer", 2200.0));

        CustomAdapter adapter = new CustomAdapter(this,R.layout.row, employeeList);
        lvEmployeeInfo.setAdapter(adapter);

    }
}
