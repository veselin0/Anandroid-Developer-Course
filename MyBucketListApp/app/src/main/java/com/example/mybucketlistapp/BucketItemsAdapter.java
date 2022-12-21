package com.example.mybucketlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketItemsAdapter extends RecyclerView.Adapter<BucketItemsAdapter.BucketItemViewHolder> {

    private BucketItem[] items;

    public BucketItemsAdapter(BucketItem[] items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public BucketItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_item, parent, false);
        return new BucketItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }

    static class BucketItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemTitle;
        private TextView itemDescription;

        public BucketItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemImage = itemView.findViewById(R.id.image_view_item_icon);
            this.itemTitle = itemView.findViewById(R.id.text_view_item_title);
            this.itemDescription = itemView.findViewById(R.id.text_view_item_description);
        }

        public void bind(BucketItem item) {
            itemTitle.setText(item.name);
            itemDescription.setText(item.description);
            itemImage.setImageResource(item.image);
        }
    }


}
