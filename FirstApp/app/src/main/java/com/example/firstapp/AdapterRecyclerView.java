package com.example.firstapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>{

    private ArrayList<ItemModel> dataItem;

    //kelas yang akan dipakai untuk viewholder
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView texSubHead;
        ImageView imageIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //inisiasi dengan id untuk text judul, sub text, dan image
            textHead = itemView.findViewById(R.id.text_title);
            texSubHead = itemView.findViewById(R.id.text_sub);
            imageIcon = itemView.findViewById(R.id.imageList);

        }
    }

    //untuk mengisi adapter yang akan di isi
    AdapterRecyclerView(ArrayList<ItemModel> dataItem){
        this.dataItem = dataItem;

    }

    //adapter untuk menampilkan layout list view
    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);

    }
    //adapter untuk menapilkan value dari text,head,dan image di recycler view
    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubHead = holder.texSubHead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubHead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
