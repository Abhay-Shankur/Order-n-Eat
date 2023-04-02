package com.application.orderneat.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.application.orderneat.R;
import com.application.orderneat.adapters.CardViewListAdapter;
import com.application.orderneat.dataModel.CardViewModel;
import com.application.orderneat.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        CardViewModel[] list = new CardViewModel[]{
                new CardViewModel(R.drawable.logo, "Pizza", "Dominos", 199, (float)4.2),
                new CardViewModel(R.drawable.logo, "Pizza", "Dominos", 199, (float)4.2) ,
                new CardViewModel(R.drawable.logo, "Pizza", "Dominos", 199, (float)4.2)
        };

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.recyclerView.setAdapter(new CardViewListAdapter(list));
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}