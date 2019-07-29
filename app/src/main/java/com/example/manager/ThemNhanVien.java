package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class ThemNhanVien extends AppCompatActivity {
    private EditText ID, ten, chucvu, PhongBan, GioiThieu;
    ArrayList<Employee> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_nhan_vien);
    }

    public  void btnOK(View view){

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

    }
    public  void btnCancel(View view){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
