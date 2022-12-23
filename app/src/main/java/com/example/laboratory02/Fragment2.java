package com.example.laboratory02;

import android.os.Bundle;
import android.view.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    Fragment2Adapter adapter;
    List<String> items = new ArrayList<>();

    Fragment2() {
        super(R.layout.fragment2_layout);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2_layout, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        items.add("Iphone 6");
        items.add("Iphone 7");
        items.add("Iphone 8");
        items.add("Iphone X");
        items.add("Iphone Xs");
        items.add("Iphone 11");
        items.add("Iphone 12");
        items.add("Iphone 13");
        items.add("Iphone 14");

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new Fragment2Adapter(this.getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}