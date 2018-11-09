package com.example.rakshitha.farmersfriend;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.FarmerViewholder> {

    Context context;
    List<Farmers> my_items;

    public HomeAdapter(Context context, List<Farmers> my_items) {
        this.context = context;
        this.my_items = my_items;
    }

    @NonNull
    @Override
    public FarmerViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_layout,null);
        return new FarmerViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FarmerViewholder farmerViewholder, int i) {
        Farmers items = my_items.get(i);

        farmerViewholder.title.setText(items.getName());
        farmerViewholder.desc.setText(items.getDesc());
        farmerViewholder.price.setText(String.valueOf(items.getPrice()));
        farmerViewholder.imageView.setImageDrawable(context.getResources().getDrawable(items.getImage()));

    }

    @Override
    public int getItemCount() {
        return my_items.size();
    }


    class FarmerViewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title, desc , price;

        public FarmerViewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textViewTitle);
            desc = itemView.findViewById(R.id.textViewShortDesc);
            price = itemView.findViewById(R.id.textViewPrice);
        }
    }
}