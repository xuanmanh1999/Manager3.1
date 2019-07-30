package com.example.manager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_ADD=110;
    public static final int RESULT_CODE_SAVE=0;
    public static final int RESULT_CODE_CANCEL=112;

    RecyclerView recyclerView;
    EmployeeAdapter adapter;
    ArrayList<Employee> mArrayList;
    private Button themnhanvien;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.studentsList);
        mArrayList = new ArrayList<Employee>();
//Tự phát sinh 50 dữ liệu mẫu để kiểm tra view
        for (int i = 1; i <= 2; i++) {
            mArrayList.add(new Employee(i, "Nguyễn Văn A"+i, "Chuyển viên", "Quản trị", "Nhân viên sẽ chịu trách nhiệm xử lý sự cố khi ..."));
        }
        adapter = new EmployeeAdapter(mArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void btnOnClick(View view){
        Intent intent = new Intent(this, ThemNhanVien.class);

        startActivityForResult(intent,REQUEST_CODE_ADD);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Toast.makeText(MainActivity.this, "Bỏ qua onActivityResult", Toast.LENGTH_SHORT).show();

        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE_ADD)
        {
            //Kiểm trả ResultCode trả về, cái này ở bên InputDataActivity truyền về
            //có nó rồi thì xử lý trở lên thông thường
            switch(resultCode)
            {
                case RESULT_CODE_SAVE:
                    //giá trị từ InputDataActivity
                    Employee obj = (Employee) data.getSerializableExtra("newEmployee");
                    mArrayList.add(obj);
                    adapter.notifyDataSetChanged();
                    break;
                case RESULT_CODE_CANCEL:
                    //giá trị từ InputDataActivity
                    Toast.makeText(this, "Bỏ qua", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
