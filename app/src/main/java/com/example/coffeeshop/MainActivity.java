package com.example.coffeeshop;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.coffeeshop.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.coffeeshop.R.id;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new Fragment());
        binding.bottomNavigation.setBackground(null);

        binding.bottomNavigation.setOnItemSelectedListener(this::onNavigationItemSelected);

    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }

    private boolean onNavigationItemSelected(MenuItem item) {

        if (item.getItemId() == id.home) {
            replaceFragment(new Fragment1());
        } else if (item.getItemId() == id.cart) {
            replaceFragment(new Fragment2());
        } else if (item.getItemId() == id.fav) {
            replaceFragment(new Fragment3());

        } else if (item.getItemId() == id.notifications) {
            replaceFragment(new Fragment4());


        }
        return true;
    }
}