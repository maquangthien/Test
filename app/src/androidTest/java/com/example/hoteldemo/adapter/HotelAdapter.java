package com.example.hoteldemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hoteldemo.R;
import com.example.hoteldemo.models.Hotel;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    Context context;
    List<Hotel> list;

    public HotelAdapter(Context context, List<Hotel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HotelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.ViewHolder holder, int position) {
        Hotel hotel = list.get(position);
        holder.hotel_name.setText(hotel.getHotelName());
        holder.hotel_location.setText(hotel.getLocation());
        holder.hotel_rating.setText(String.valueOf(hotel.getStarRating()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder  extends  RecyclerView.ViewHolder{
        ImageView hotel_image;
        TextView hotel_name, hotel_location,hotel_rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hotel_image =  itemView.findViewById(R.id.hotel_image);
            hotel_name = itemView.findViewById(R.id.hotel_name);
            hotel_location =  itemView.findViewById(R.id.hotel_location);
            hotel_rating = itemView.findViewById(R.id.hotel_rating);
        }
    }
}
