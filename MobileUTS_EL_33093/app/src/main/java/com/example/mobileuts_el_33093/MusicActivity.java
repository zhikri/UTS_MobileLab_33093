package com.example.mobileuts_el_33093;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        getSupportActionBar().setTitle("Daftar Lagu");
        getAlert();
    }

    private void getAlert() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MusicActivity.this);
        String alertMessage1 = "Selamat Datang";
        String alertMessage2 = "Muhammad Zhikri";
        String alertMessage3 = "00000033093";
        alert.setMessage(alertMessage1+"\n"+alertMessage2+"\n"+alertMessage3);

        alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menuProfil){
            startActivity(new Intent(MusicActivity.this, ProfilActivity.class));
        }
        if(id == R.id.menuLogOut){
            startActivity(new Intent(MusicActivity.this, MainActivity.class));
        }
        return true;
    }
}