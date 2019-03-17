package com.example.user.tugasbiodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView Image;
    TextView txtnama;
    TextView txtnpm;
    TextView txttempattanggallahir;
    TextView txtalamat;
    TextView txthobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Image = (ImageView) findViewById(R.id.Image);

        txtnama = (TextView) findViewById (R.id.txtnama);
        txtnama.setText("KomangNurr");

        txtnpm = (TextView) findViewById (R.id.txtnpm);
        txtnpm.setText("16411054");

        txttempattanggallahir = (TextView) findViewById (R.id.txtttempattanggallahir);
        txttempattanggallahir.setText("BandarLampung, 17 Juli 1998");

        txtalamat = (TextView) findViewById (R.id.txtalamat);
        txtnpm.setText("Jl. Dahlia no.5 labuhan dalam BandarLampung");

        txthobi = (TextView) findViewById (R.id.txthobi);
        txthobi.setText("Travelling dan nonton");



    }
}
