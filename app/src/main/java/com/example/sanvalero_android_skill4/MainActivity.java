package com.example.sanvalero_android_skill4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Video 32
 */
/*
public class MainActivity extends AppCompatActivity {

    TextView txt1;
    EditText campo1, campo2, campo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview_edittext);

        txt1 = (TextView) findViewById(R.id.textView);
        campo1 = (EditText) findViewById(R.id.txt1);
        campo2 = (EditText) findViewById(R.id.txt2);
        campo3 = (EditText) findViewById(R.id.txt3);


    }

    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                obtenerInfo();
                break;
        }
    }

    public void obtenerInfo() {
        int num = Integer.parseInt(campo1.getText().toString());
        String pass = campo2.getText().toString();
        String parrafo = campo3.getText().toString();

        Toast.makeText(getApplicationContext(), "Dato numérico: " + num, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Dato pass: " + pass, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Dato parrafo: " + parrafo, Toast.LENGTH_SHORT).show();
    }
}*/

/**
 * Video 33
 */
/*public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);


    }

    public void onclick(View view) {
        if ( view.getId() == R.id.button ) {
            validar();
        }
    }

    public void validar() {
        String cad = "Selected: \n";

        if (c1.isChecked() == true) {
            cad+="Op1";
        }

        if (c2.isChecked() == true) {
            cad+="Op2";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }
}*/

/**
 * Video 34
 */
/*public class MainActivity extends AppCompatActivity {

    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);

        r1 = (RadioButton) findViewById(R.id.radioBtn1);
        r2 = (RadioButton) findViewById(R.id.radioBtn2);


    }

    public void onclick(View view) {
        if ( view.getId() == R.id.button ) {
            validar();
        }
    }

    public void validar() {
        String cad = "Selected: \n";

        if (r1.isChecked() == true) {
            cad+="Op1";
        }

        if (r2.isChecked() == true) {
            cad+="Op2";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }
}*/

/**
 * Video 35
 */
/*public class MainActivity extends AppCompatActivity {

    ToggleButton t1;
    TextView txtEti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_button);

        t1 = (ToggleButton) findViewById(R.id.toggleButton);
        txtEti = (TextView) findViewById(R.id.textView4);


    }

    public void onclick(View view) {
        if ( view.getId() == R.id.toggleButton ) {
            if (t1.isChecked()) {
                txtEti.setText("Botón on");
            } else {
                txtEti.setText("Botón off");
            }
        }
    }
}*/

/**
 * Video 36
 */
/*public class MainActivity extends AppCompatActivity {

    Switch s1;
    TextView txtEti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_button);

        s1 = (Switch) findViewById(R.id.switch1);
        txtEti = (TextView) findViewById(R.id.textView4);


    }

    public void onclick(View view) {
        if ( view.getId() == R.id.switch1 ) {
            if (s1.isChecked()) {
                txtEti.setText("Activado");
            } else {
                txtEti.setText("No activado");
            }
        }
    }
}*/

/**
 * Video 37
 */
/*public class MainActivity extends AppCompatActivity{

    public static String TAG = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        Log.i("info", "Valor información");
        Log.d("debug", "Valor debug");
        Log.w("warning", "Valor warning");
        Log.e("error", "Valor error");
        Log.v("verbose", "Valor verbose");

        Log.i(TAG, "Valor prueba");


    }
}*/

/**
 * Video 39
 */
/*public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        /**
         * Clase Intent: Cargar una nueva actividad (actual, objetivo)
         * Clase Bundle: Introducir valores que pueden agregarse a la clase
         *               Intent. De esta manera puedes mover datos entre
         *               actividades.
         */
    /*}
}*/

/**
 * Video 40
 */
public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        /**
         * Clase Intent: Cargar una nueva actividad (actual, objetivo)
         * Clase Bundle: Introducir valores que pueden agregarse a la clase
         *               Intent. De esta manera puedes mover datos entre
         *               actividades.
         */
    }
}

/**
 * Video 41 -> Spinner
 * Puedes crear una lista deplegable gracias a la clase Spinner
 * Para definir sus variables es recomendable crear un reource value
 * que contenga una definición de array (String-array ejemplo) con las opciones como item en su interior.
 * Despues se carga en el mainActivity, se genera ArrayAdapter, un setOnItemSelectedListener
 * y con eso puedes obetener y utilizar su estado.
 */

/**
 * Video 42 -> Spinner + ArrayList
 * En lugar de usar el resource value, si necesitas cargar los datos en el backend
 * se utiliza un arrayList. También se necesita un arrayAdapter (new ArrayAdapter).
 * El resto es igual.
 */

/**
 * Video 44 -> ListView
 * Objeto listView. Se inicializa en el MainActivity. ArrayAdapter<ArrayAdapter>
 *     Introducir referencia a la lista del resource value
 * SetAdapter.
 * Para el onListener es igual que el spinner
 */

/**
 * Video 45 -> ListView + ArrayList
 * Es el mismo proceso que trabajar con el Spinner + ArrayList
 * ArrayAdapter new ArrayAdapter -> setOnItemClickListener
 */