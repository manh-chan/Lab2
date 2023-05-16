package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2lab2);
        TextView txtresult = findViewById(R.id.txtresult);
        EditText edt_hoten = findViewById(R.id.edt_hoten);
        EditText edt_masv = findViewById(R.id.edt_masv);
        EditText edt_tuoi = findViewById(R.id.edt_tuoi);
        RadioButton rdonam = findViewById(R.id.rdonam);
        RadioButton rdonu = findViewById(R.id.rdonu);
        CheckBox cbx1 =  findViewById(R.id.cbx1);
        CheckBox cbx2 =  findViewById(R.id.cbx2);
        Button btn_click =  findViewById(R.id.btn_click);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Gt;
                String St1;
                String hoten = edt_hoten.getText().toString();
                String masv = edt_masv.getText().toString();
                String tuoi = edt_tuoi.getText().toString();
                boolean nam = rdonam.isChecked();
                boolean dabong =cbx1.isChecked();
                boolean choigame =cbx2.isChecked();
                if (nam) {
                    Gt="nam";

                }
                else{
                    Gt="nu";
                }
                if (dabong && choigame){
                    St1="Da bong ,choigame";

                } else if (dabong==true && choigame==false){
                    St1="Choi Game";
                }else if (dabong==false && choigame==true){
                    St1 ="Da Bong";
                }else {
                    St1="khong co st";
                }
                txtresult.setMaxLines(5);
                txtresult.setText("Ho va ten:"+hoten+"\n"+ "Ma Sinh Vien:"+masv+"\n"+"Tuoi:"+tuoi+"\n"
                        +"Gioi Tinh:"+Gt+"\n"
                        +"So thich:"+St1+"\n");

            }
        });


    }
}