package com.example.cw7.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cw7.databinding.FragmentOnBoardBinding;


public class OnBoardFragment extends Fragment {
    private FragmentOnBoardBinding binding;

    public static final String TITLE_1 = "title 1";
    public static final String TITLE_2 = "title 2";
    public static final String IMAGE = "image";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            binding.tvFirstText.setText(getArguments().getString(TITLE_1));
            binding.tvSecondText.setText(getArguments().getString(TITLE_2));
            binding.avatar.setImageResource(getArguments().getInt(IMAGE ));
        }
    }
}