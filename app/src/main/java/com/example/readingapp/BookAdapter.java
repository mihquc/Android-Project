package com.example.readingapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvAuthor;
        private TextView tvCategory;
        private ImageButton ibBook;
        public ViewHolder(@NonNull View view) {
            super(view);

            tvAuthor = view.findViewById(R.id.tv_tacgia);
            tvCategory = view.findViewById(R.id.tv_theloai);
            ibBook = view.findViewById(R.id.ib_book);
        }
    }
}
