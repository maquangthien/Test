package com.example.hoteldemo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import com.example.hoteldemo.adapter.HotelAdapter;
//import com.example.hoteldemo.models.Hotel;
import com.example.hoteldemo.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

//        recyclerView = root.findViewById(R.id.hotel_hor_rec);
//        hotelList = new ArrayList<>();
//        adapter = new HotelAdapter(getContext(), hotelList);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
//        recyclerView.setLayoutManager(layoutManager);
//
//        recyclerView.setAdapter(adapter); // Gán adapter cho RecyclerView

        return root;
    }
}

