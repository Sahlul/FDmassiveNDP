package com.example.fdmassivendp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context contex;
    ArrayList<resep> list;

    public MyAdapter(Context contex, ArrayList<resep> list) {
        this.contex = contex;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(contex).inflate(R.layout.resepentry,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        resep resep = list.get(position);
        holder.judul.setText(resep.getJudulmasakan());
        holder.resep.setText(resep.getKetresep());
        holder.bahan.setText(resep.getFormbahan());
        holder.langkah.setText(resep.getLangkahpembuatan());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView judul,resep,bahan,langkah;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            judul = itemView.findViewById(R.id.textjudul);
            resep = itemView.findViewById(R.id.textketresep);
            bahan = itemView.findViewById(R.id.textbahan);
            langkah = itemView.findViewById(R.id.textlangkah);
        }
    }
}
