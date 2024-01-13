package com.example.netscape;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;

import com.google.android.material.tabs.TabLayout;

import java.sql.Ref;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private LinearLayout RefineButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabMode);
        viewPager=findViewById(R.id.viewPager);
        RefineButton=findViewById(R.id.refineButton);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter= new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new PersonalFragment(),"Personal");
        vpAdapter.addFragment(new BusinessFragment(),"Business");
        vpAdapter.addFragment(new MerchantFragment(),"Merchant");
        viewPager.setAdapter(vpAdapter);

        RefineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RefineActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}