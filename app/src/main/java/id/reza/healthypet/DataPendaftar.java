package id.reza.healthypet;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DataPendaftar extends AppCompatActivity {

    private TextView hasilnama, hasilnamap, hasiltelepon, hasiljk, hasilumur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datapendaftar);

        String nama = getIntent().getExtras().getString("nama");
        String namap = getIntent().getExtras().getString("namap");
        String telepon = getIntent().getExtras().getString("telepon");
        String jk = getIntent().getExtras().getString("jk");
        String jh = getIntent().getExtras().getString("jh");
        String umur = getIntent().getExtras().getString("umur");

        hasilnama = findViewById(R.id.input_nama);
        hasilnamap = findViewById(R.id.input_nmpeliharaan);
        hasiltelepon = findViewById(R.id.input_notelepon);
        hasiljk = findViewById(R.id.input_jeniskelamin);
        hasilumur = findViewById(R.id.angkaumur);

        hasilnama.setText( "" + nama);
        hasilnamap.setText( "" + namap);
        hasiltelepon.setText( "" + telepon);
        hasiljk.setText( "" + jk);
        hasilumur.setText( "" + umur);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Menampilkan data...", Toast.LENGTH_LONG).show(); //onDestroy Called
        Log.d(TAG, "resume");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"Mengambil data...", Toast.LENGTH_SHORT).show(); //onStart Called
        Log.d(TAG, "start");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Kembali ke pendaftaran...", Toast.LENGTH_LONG).show(); //onDestroy Called
        Log.d(TAG, "destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Mengeluarkan aplikasi...", Toast.LENGTH_LONG).show();
        Log.d(TAG, "stop");
    }

}