package com.example.appnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.navigation_second_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toast.makeText(getActivity().getApplicationContext(), "Bundle args " + getArguments().getString("text"), Toast.LENGTH_SHORT).show();

        Produto produto = (Produto) getArguments().getSerializable("obj");

        if (produto == null) {
            Toast.makeText(getActivity().getApplicationContext(), "Produto null", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity().getApplicationContext(), "Produto " + produto.getId(), Toast.LENGTH_SHORT).show();
        }

        Button button_back = view.findViewById(R.id.button_back);
        button_back.setOnClickListener(v -> {
            final NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
            navController.navigateUp();
        });

        View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_threeFragment);
        Button button_next = view.findViewById(R.id.button_frag2);
        button_next.setOnClickListener(s);
    }

}
