package id.reza.healthypet;

import static java.lang.String.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    //    Initilize Variable
    EditText input_nama, input_peliharaan, input_telpon;
    RadioGroup radio_jk;
    RadioButton rbmale, rbfemale;
    CheckBox cb1, cb2;
    SeekBar skumur;
    TextView angkaumur;
    Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_nama = findViewById(R.id.input_nmpemilik);
        input_peliharaan = findViewById(R.id.input_nmpeliharaan);
        input_telpon = findViewById(R.id.input_notelepon);
        radio_jk = findViewById(R.id.radio_jenkel);
        rbmale = findViewById(R.id.male);
        rbfemale = findViewById(R.id.female);
        cb1 = findViewById(R.id.check_anjing);
        cb2 = findViewById(R.id.check_kucing);
        skumur = findViewById(R.id.seekbar_umur);
        angkaumur = findViewById(R.id.umur);
        btn_daftar = findViewById(R.id.button_daftar);
        angkaumur.setText(skumur.getProgress() + " Bulan");
        skumur.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                angkaumur.setText(progress + (" Bulan"));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //TOMBOL DAFTAR
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmpemilik = input_nama.getText().toString();
                if(nmpemilik.isEmpty()){
                    alert("hmmm");
                }else {
                    alert(nmpemilik);
                }
            }



            //CREATE CUSTOMISE ALERT
            private void alert(String message){

                String nmpemilik = input_nama.getText().toString();
                String nmpeliaharan = input_peliharaan.getText().toString();
                String notelepon = input_telpon.getText().toString();
                String umur = angkaumur.getText().toString();
                int id_pilihan = radio_jk.getCheckedRadioButtonId();
                RadioButton jk_pilihan = (RadioButton) findViewById(id_pilihan);
                String jenis_pilihan = "";
                if(cb1.isChecked()){
                    jenis_pilihan += "Anjing";
                }
                if(cb2.isChecked()){
                    jenis_pilihan += "Kucing";
                }



                AlertDialog alert = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Selamat Pendaftaran Berhasil!"+'\n')
                        .setMessage("Nama pemilik        : "+nmpemilik+'\n'+"Nama peliharaan  : "+nmpeliaharan+'\n'+"No telepon             : "+notelepon+'\n' + "Jenis kelamin        : "+jk_pilihan.getText().toString()+'\n' + "Jenis hewan          : "+ jenis_pilihan+'\n'+"Umur peliharaan   : "+umur)
                        .setPositiveButton("OKE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {dialog.dismiss();

                            }
                        }).create();
                alert.show();
            }
        });

    }
}