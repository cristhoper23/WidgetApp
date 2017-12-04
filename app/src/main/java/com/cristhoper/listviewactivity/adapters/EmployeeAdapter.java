package com.cristhoper.listviewactivity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cristhoper.listviewactivity.R;
import com.cristhoper.listviewactivity.models.Employee;

import java.util.List;

/**
 * Created by Cris on 3/12/2017.
 */

public class EmployeeAdapter extends BaseAdapter{

    Context contexto;
    List<Employee> listaEmpleados;

    public EmployeeAdapter(Context contexto, List<Employee> listaEmpleados) {
        this.contexto = contexto;
        this.listaEmpleados = listaEmpleados;
    }

    //Retorna la cantidad de elementos de la lista
    @Override
    public int getCount() {
        return listaEmpleados.size();
    }

    //Este método permite obtener el objeto de la posición indicada
    @Override
    public Object getItem(int position) {
        return listaEmpleados.get(position);
    }

    //Retorna el Id de la posicion indicada
    @Override
    public long getItemId(int position) {
        return listaEmpleados.get(position).getId();
    }

    //getView se ejecuta en cada secuencia en la cual se quiera cargar el contenido
    //de cada hito del listview
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View vista = view;

        //LayoutInflater instantiates a layout XML file into its corresponding View objects.
        //De esta forma podemos inflar la vista declarada (item_employee) en el contexto
        //donde se encuentra el listview declarado
        LayoutInflater inflater = LayoutInflater.from(contexto);
        vista = inflater.inflate(R.layout.item_employee, null);

        ImageView imagen = vista.findViewById(R.id.employee_image);
        TextView nombre = vista.findViewById(R.id.employee_name);
        TextView cargo = vista.findViewById(R.id.employee_cargo);

        nombre.setText(listaEmpleados.get(position).getNombre());
        cargo.setText(listaEmpleados.get(position).getCargo());
        imagen.setImageResource(listaEmpleados.get(position).getImagen());

        return vista;
    }
}
