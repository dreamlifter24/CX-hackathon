package com.example.bottomnavigation.ui.portfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;


import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;


import com.example.bottomnavigation.R;
import com.example.bottomnavigation.databinding.FragmentPortfolioBinding;

public class PortfolioFragment extends Fragment {

    private PortfolioViewModel portfolioViewModel;
    private FragmentPortfolioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        portfolioViewModel = new ViewModelProvider(this).get(PortfolioViewModel.class);
        binding = FragmentPortfolioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.vaccinationbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                NavHostFragment.findNavController(PortfolioFragment.this).navigate(R.id.to_vaccination_record);
            }

        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
