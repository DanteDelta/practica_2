package com.example.practica_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
    CheckBox Pizza, Cafe, Hamburgesa;
    Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        Pizza = (CheckBox)findViewById(R.id.checkBox1);
        Cafe = (CheckBox)findViewById(R.id.checkBox2);
        Hamburgesa = (CheckBox)findViewById(R.id.checkBox3);
        btnOrder=(Button)findViewById(R.id.button1);

        btnOrder.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalPago=0;
                StringBuilder result = new StringBuilder();
                result.append("Productos seleccionados: ");
                if(Pizza.isChecked()){
                    result.append("\nPizza $50");
                    totalPago+=50;
                }
                if(Cafe.isChecked()){
                    result.append("\nCafé $25");
                    totalPago+=25;
                }
                if(Hamburgesa.isChecked()){
                    result.append("\nHamburguesa $45");
                    totalPago+=45;
                }
                result.append("\nTotal: "+totalPago+" pesos");
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
