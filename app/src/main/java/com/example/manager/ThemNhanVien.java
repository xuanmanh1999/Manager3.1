package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class ThemNhanVien extends AppCompatActivity {
    private EditText edId, edTen, edChucvu, edPhongban, edGioithieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_nhan_vien);

        edId = findViewById(R.id.edId);
        edTen = findViewById(R.id.edTen);
        edChucvu = findViewById(R.id.edChucvu);
        edPhongban = findViewById(R.id.edPhongban);
        edGioithieu = findViewById(R.id.edGioithieu);
    }

    public  void btnOK(View view){
        sendToMain(MainActivity.RESULT_CODE_SAVE);
    }
    public  void btnCancel(View view){
        setResult(MainActivity.RESULT_CODE_CANCEL);
        finish();
    }

//    public  void btnCancel(View view){
//        onBackPressed();
//    }


    public void sendToMain(int resultcode)
    {
        Intent intent= new Intent();

        Employee obj = new Employee();
        obj.setiD(Integer.valueOf(edId.getText().toString()));
        obj.setName(edTen.getText().toString());
        obj.setPosition(edChucvu.getText().toString());
        obj.setDepartment(edPhongban.getText().toString());
        obj.setDescribe(edGioithieu.getText().toString());
        intent.putExtra("newEmployee", obj);
        setResult(resultcode, intent);

        finish();
    }
}
