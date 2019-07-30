package com.example.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder > {
    //Dữ liệu hiện thị là danh sách sinh viên
    public List mList;
    // Lưu Context để dễ dàng truy cập
    private Context mContext;

    public EmployeeAdapter(List _list, Context mContext) {
        this.mList = _list;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Nạp layout cho View biểu diễn phần tử
        //Tùy thuộc viewType của phần tử
        View view = null;

        view = inflater.inflate(R.layout.item_employee,
                parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Employee obj = (Employee) mList.get(position);

        holder.mName.setText(obj.getName());
        holder.mPosition.setText(obj.getPosition());
        holder.mDepartment.setText(obj.getDepartment());
        holder.mDescribe.setText(obj.getDescribe());


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * Lớp nắm giữ cấu trúc view
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private View itemview;
        public TextView mName;
        public TextView mPosition;
        public TextView mDepartment;
        public TextView mDescribe;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemview = itemView;
            mName = itemView.findViewById(R.id.tvName);
            mPosition = itemView.findViewById(R.id.tvPosition);
            mDepartment = itemView.findViewById(R.id.tvDepartment);
            mDescribe = itemView.findViewById(R.id.tvDescribe);

        }

    }
}
