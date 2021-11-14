package id.reza.healthypet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataPendaftar extends AppCompatActivity {

    private TextView hasilnama, hasilnamap, hasiltelepon, hasiljk, hasiljh, hasilumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pendaftar);

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
}