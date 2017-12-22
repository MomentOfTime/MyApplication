package com.example.a11347.myapplication;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<Fragment> list;
    private MyAdapter adapter;
    private String[] titles = {"Tab1", "Tab2", "Tab3","Tab4","Tab5","Tab6","Tab7","Tab8","Tab9","Tab10","Tab11","Tab12","Tab13","Tab14","Tab15"
            ,"Tab16", "Tab17", "Tab18","Tab19","Tab20","Tab21","Tab22","Tab23","Tab24","Tab25","Tab26","Tab27","Tab28","Tab29","Tab30"};
    Fragment Tab1Fragment = new Fragment();
    Fragment Tab2Fragment = new Fragment();
    Fragment Tab3Fragment = new Fragment();
    Fragment Tab4Fragment = new Fragment();
    Fragment Tab5Fragment = new Fragment();
    Fragment Tab6Fragment = new Fragment();
    Fragment Tab7Fragment = new Fragment();
    Fragment Tab8Fragment = new Fragment();
    Fragment Tab9Fragment = new Fragment();
    Fragment Tab10Fragment = new Fragment();
    Fragment Tab11Fragment = new Fragment();
    Fragment Tab12Fragment = new Fragment();
    Fragment Tab13Fragment = new Fragment();
    Fragment Tab14Fragment = new Fragment();
    Fragment Tab15Fragment = new Fragment();
    Fragment Tab16Fragment = new Fragment();
    Fragment Tab17Fragment = new Fragment();
    Fragment Tab18Fragment = new Fragment();
    Fragment Tab19Fragment = new Fragment();
    Fragment Tab20Fragment = new Fragment();
    Fragment Tab21Fragment = new Fragment();
    Fragment Tab22Fragment = new Fragment();
    Fragment Tab23Fragment = new Fragment();
    Fragment Tab24Fragment = new Fragment();
    Fragment Tab25Fragment = new Fragment();
    Fragment Tab26Fragment = new Fragment();
    Fragment Tab27Fragment = new Fragment();
    Fragment Tab28Fragment = new Fragment();
    Fragment Tab29Fragment = new Fragment();
    Fragment Tab30Fragment = new Fragment();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        //页面，数据源
        list = new ArrayList<>();
        list.add(Tab1Fragment);
        list.add(Tab2Fragment);
        list.add(Tab3Fragment);
        list.add(Tab4Fragment);
        list.add(Tab5Fragment);
        list.add(Tab6Fragment);
        list.add(Tab7Fragment);
        list.add(Tab8Fragment);
        list.add(Tab9Fragment);
        list.add(Tab10Fragment);
        list.add(Tab11Fragment);
        list.add(Tab12Fragment);
        list.add(Tab13Fragment);
        list.add(Tab14Fragment);
        list.add(Tab15Fragment);
        list.add(Tab16Fragment);
        list.add(Tab17Fragment);
        list.add(Tab18Fragment);
        list.add(Tab19Fragment);
        list.add(Tab20Fragment);
        list.add(Tab21Fragment);
        list.add(Tab22Fragment);
        list.add(Tab23Fragment);
        list.add(Tab24Fragment);
        list.add(Tab25Fragment);
        list.add(Tab26Fragment);
        list.add(Tab27Fragment);
        list.add(Tab28Fragment);
        list.add(Tab29Fragment);
        list.add(Tab30Fragment);


        //ViewPager的适配器
        adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        //绑定
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
           return list.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

    }
}