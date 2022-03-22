package com.example.cw7.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cw7.OnBoardModal;
import com.example.cw7.fragment.OnBoardFragment;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingAdapter extends FragmentStateAdapter {

    List<OnBoardModal> list = new ArrayList<>();

    public OnBoardingAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, List<OnBoardModal> list) {
        super(fragmentManager, lifecycle);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new OnBoardFragment();
        Bundle bundle = new Bundle();
        bundle.putString(OnBoardFragment.TITLE_1, list.get(position).getFirstTitle());
        bundle.putString(OnBoardFragment.TITLE_1, list.get(position).getFirstTitle());
        bundle.putString(OnBoardFragment.TITLE_1, list.get(position).getFirstTitle());
        bundle.putString(OnBoardFragment.TITLE_2, list.get(position).getSecondTitle());
        bundle.putString(OnBoardFragment.TITLE_2, list.get(position).getSecondTitle());
        bundle.putString(OnBoardFragment.TITLE_2, list.get(position).getSecondTitle());
        bundle.putInt(OnBoardFragment.IMAGE,list.get(position).getImage());
        bundle.putInt(OnBoardFragment.IMAGE,list.get(position).getImage());
        bundle.putInt(OnBoardFragment.IMAGE,list.get(position).getImage());
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
