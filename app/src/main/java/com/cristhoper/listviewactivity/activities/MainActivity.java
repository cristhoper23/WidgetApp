package com.cristhoper.listviewactivity.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.cristhoper.listviewactivity.R;
import com.cristhoper.listviewactivity.adapters.EmployeeAdapter;
import com.cristhoper.listviewactivity.models.Employee;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaEmpleados;
    ArrayList<Employee> empleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEmpleados = findViewById(R.id.employee_listView);

        empleados = new ArrayList<>();

        empleados.add(new Employee(1,"Gato","Felino", R.drawable.gato));
        empleados.add(new Employee(2,"Perro","Perruno", R.drawable.perro));
        empleados.add(new Employee(3,"Zorro","Vulpix", R.drawable.zorro));

        EmployeeAdapter employeeAdapter = new EmployeeAdapter(getApplicationContext(), empleados);

        listaEmpleados.setAdapter(employeeAdapter);
    }
}
