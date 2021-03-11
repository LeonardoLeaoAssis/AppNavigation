package com.example.appnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class ThreeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.navigation_three_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button_back = view.findViewById(R.id.buttonBack);
        button_back.setOnClickListener(v -> {
            final NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
            navController.navigateUp();
        });

        View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.action_threeFragment_to_fourActivity);
        Button button = view.findViewById(R.id.buttonNext);
        button.setOnClickListener(s);
    }

}