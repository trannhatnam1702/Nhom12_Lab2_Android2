package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    EditText edtTen, edtMSSV, edtTuoi;
    Button btnLuu;
    RadioButton rdoNam, rdoNu;

    CheckBox chbDaBong, chbGame;
    TextView txtvKQ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate:");

//        edtA = findViewById(R.id.edtA);
//        edtB = findViewById(R.id.edtB);
//        edtKQ = findViewById(R.id.edtKQ);
//        btnTong = findViewById(R.id.btnTong);
//
//        btnTong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a = Integer.parseInt(edtA.getText().toString());
//                int b = Integer.parseInt(edtB.getText().toString());
//                int kq = a + b;
//                edtKQ.setText(kq+"");
//            }
//        });
        RadioGroup group = (RadioGroup) findViewById(R.id.rdoGioiTinh);
        edtTen = findViewById(R.id.edtTen);
        edtMSSV = findViewById(R.id.edtMSSV);
        edtTuoi = findViewById(R.id.edtTuoi);
        btnLuu = findViewById(R.id.btnLuu);
        //rdoGioiTinh = findViewById(R.id.rdoGioiTinh);
        rdoNam = findViewById(R.id.rdoNam);
        rdoNu = findViewById(R.id.rdoNu);
        chbDaBong = findViewById(R.id.chbDaBong);
        chbGame = findViewById(R.id.chbGame);
        txtvKQ = findViewById(R.id.txtvKQ);
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten, mssv, tuoi, gioitinh, sothich = "";
                ten = String.valueOf(edtTen.getText());
                mssv = String.valueOf(edtMSSV.getText());
                tuoi = String.valueOf(edtTuoi.getText());
                if(rdoNam.isChecked())
                {
                    gioitinh = "Nam";
                } else {
                    gioitinh = "Nữ";
                }
                if(chbDaBong.isChecked())
                {
                    sothich = "Đá bóng";
                } else if (chbGame.isChecked()) {
                    sothich = "Chơi game";
                } else if(chbDaBong.isChecked() && chbGame.isChecked()) {
                    sothich = "Đá bóng, chơi game";
                }
                txtvKQ.setText("Tôi tên: "+ten+"\nMSSV: "+mssv+"\nTuổi: "+tuoi+"\nGiới tính: "+gioitinh+"\nSở thích: "+sothich);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart:");
    }
}