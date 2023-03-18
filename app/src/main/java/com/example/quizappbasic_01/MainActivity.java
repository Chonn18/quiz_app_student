package com.example.quizappbasic_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;


import com.example.quizappbasic_01.monhoc.SubjectFragment;

import com.example.quizappbasic_01.point.PointFragment;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final int FRAGMENT_SUBJECT = 1;
    public static final int FRAGMENT_POINT = 2;
    public static final int MY_REQUEST_CODE = 10;


    public int mCurrentFragment = FRAGMENT_SUBJECT;
    public NavigationView mNavigationView;

    DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initUi();

        mDrawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                R.string.nav_drawer_open, R.string.nav_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(this);

        replaceFragment(new SubjectFragment());
        mNavigationView.getMenu().findItem(R.id.nav_subject).setChecked(true);
    }

    private void initUi() {
        mNavigationView = findViewById(R.id.navigation_view);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.nav_subject:
                if (mCurrentFragment != FRAGMENT_SUBJECT) {
                    replaceFragment(new SubjectFragment());
                    mCurrentFragment = FRAGMENT_SUBJECT;
                    mNavigationView.getMenu().findItem(R.id.nav_subject).setChecked(true);
                }
                break;
            case R.id.nav_point:
                if (mCurrentFragment != FRAGMENT_POINT) {
                    replaceFragment(new PointFragment());
                    mCurrentFragment = FRAGMENT_POINT;
                    mNavigationView.getMenu().findItem(R.id.nav_point).setChecked(true);
                }
                break;
        }


        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.commit();
    }

}