package com.example.appnavigation;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("log", "onCreateView F");
        return inflater.inflate(R.layout.navigation_first_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Bundle bundle = new Bundle();
        bundle.putString("text", "Leonardo");
        bundle.putSerializable("obj", new Produto());

        View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment, bundle);
        Button button = view.findViewById(R.id.button_frag1);
        button.setOnClickListener(s);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.i("log", "onAttach F");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.i("log", "onDetach F");
        super.onDetach();
    }

    @Override
    public void onStart() {
        Log.i("log", "onStart F");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("log", "onResume F");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("log", "onPause F");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("log", "onStop F");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.i("log", "onDestroy F");
        super.onDestroy();
    }

}
