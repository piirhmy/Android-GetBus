package com.source.getbus1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    String[] driver={"pipit","haris","randi"};
    String[] pw={"123","123","123"};

    EditText nama,password;
    Button masuk,saklar;
    TextView gmail,keterangan;

    TextView waktu,halte,rute,asal,tujuan;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*login=getParent().findViewById(R.id.login);
        waktu=getParent().findViewById(R.id.waktu);
        halte=getParent().findViewById(R.id.halte);
        rute=getParent().findViewById(R.id.rute);
        asal=getParent().findViewById(R.id.asal);
        tujuan=getParent().findViewById(R.id.tujuan);
        saklar=getParent().findViewById(R.id.button);*/

        nama=findViewById(R.id.textNama);
        password=findViewById(R.id.textPassword);
        masuk=findViewById(R.id.buttonMasuk);
        gmail=findViewById(R.id.textGmail);
        keterangan=findViewById(R.id.keterangan);
        keterangan.setVisibility(View.INVISIBLE);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(nama.getText().toString().matches("")||password.getText().toString().matches(""))){
                    boolean ada=false;
                    for(int i=0;i<driver.length;i++){
                        if (driver[i].matches(nama.getText().toString()) && pw[i].matches(password.getText().toString())) {
                            ada=true;
                            break;
                        }
                    }

                    if(ada==true){
                        /*login.setText("LOGOUT");
                        saklar.setVisibility(View.VISIBLE);
                        saklar.setText("OFF");
                        waktu.setText("15 : 30");
                        rute.setText("Merah");
                        halte.setText("Berlin");
                        asal.setText("Fapeta");
                        tujuan.setText(halte.getText());*/
                        keterangan.setVisibility(View.INVISIBLE);
                        finish();
                    }
                    else{keterangan.setVisibility(View.VISIBLE);}
                }
                else {
                    keterangan.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
