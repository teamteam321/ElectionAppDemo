package com.akzaki.election;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class identity_chk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity_chk);


        Button nx = findViewById(R.id.id_check_button);

        nx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView inp = findViewById(R.id.idfield);
                String a = inp.getText().toString().trim();

                if(a.length()!=13){
                    Toast msg = Toast.makeText(identity_chk.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    msg.show();
                    return;
                }

                AlertDialog.Builder result = new AlertDialog.Builder(identity_chk.this);

                if(a.equals("1111111111111") || a.equals("2222222222222")){
                    result.setTitle("ผลการตรวจสอบสิทธิการเลือกตั้ง");
                    result.setMessage("คุณเป็นผู้มีสิทธิการเลือกตั้ง");
                }else{
                    result.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                }
                result.setPositiveButton("OK",null);
                result.show();
            }
        });
    }
}