package com.example.bottomnavigation.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentNotificationsBinding binding;

//    EditText username;
//    EditText password;
//    Button logIn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



//        username = (EditText)findViewById(R.id.editText1);
//        password = (EditText)findViewById(R.id.editText2);
//
//        logIn = (Button)findViewById(R.id.logIn);

        binding.logIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(binding.editText1.getText().toString().equals("admin") && binding.editText2.getText().toString().equals("admin")){
                    Toast.makeText(getActivity(), "Logging in..", Toast.LENGTH_SHORT).show();
                    NavHostFragment.findNavController(NotificationsFragment.this).navigate(R.id.action_to_port);


                    //correcct password
                }else{
                    Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
                    //wrong password
                }
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