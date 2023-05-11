package com.example.api;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.View_Holder> {
    @NonNull
    @Override
    public Recycler_Adapter.View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Recycler_Adapter.View_Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class View_Holder extends RecyclerView.ViewHolder {
        public View_Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
