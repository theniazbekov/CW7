package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cw7.adapter.OnBoardingAdapter;
import com.example.cw7.databinding.ActivityOnBoardBinding;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class OnBoardActivity extends AppCompatActivity {
    private ActivityOnBoardBinding binding;
    ViewPager2 viewPager2;
    DotsIndicator dot1;
    SpringDotsIndicator dot2;
    WormDotsIndicator dot3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOnBoardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        setupListener();
        pagerListener();
    }

    private void setupData() {
        List<OnBoardModal> list = new ArrayList<>();
        list.add(new OnBoardModal(R.drawable.wallet, "Wallet", "A wallet is a very important thing for every person."));
        list.add(new OnBoardModal(R.drawable.money, "Money", "Money is what is stored in the wallet"));
        list.add(new OnBoardModal(R.drawable.piggy_bank, "Piggy bank", "An ordinary cute piggy bank , for your savings"));

        OnBoardingAdapter onBoardingAdapter = new OnBoardingAdapter(getSupportFragmentManager(), getLifecycle(), list);
        binding.pager.setAdapter(onBoardingAdapter);
        binding.wormDotsIndicator.setViewPager2(binding.pager);
    }

    private void setupListener() {
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.btnNext.getText() == "Start") {
                    Intent intent = new Intent(OnBoardActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    binding.pager.setCurrentItem(binding.pager.getCurrentItem() + 1);
                }

            }
        });
        binding.btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnBoardActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void pagerListener() {
        binding.pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == 2) {
                    binding.btnNext.setText("Start");
                } else {
                    binding.btnNext.setText("Next");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}