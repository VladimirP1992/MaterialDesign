package ru.geekbrains.materialdesign.tabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import ru.geekbrains.materialdesign.R;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = Tab1Fragment.newInstance(null);
        Fragment fragment2 = Tab2Fragment.newInstance(null);
        Fragment fragment3 = Tab3Fragment.newInstance(null);

        TabAdapter myAdapter = new TabAdapter(getSupportFragmentManager());
        myAdapter.addFragment(fragment1, "tab1");
        myAdapter.addFragment(fragment2, "tab2");
        myAdapter.addFragment(fragment3, "tab3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}
