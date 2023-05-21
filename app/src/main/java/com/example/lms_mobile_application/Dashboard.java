package com.example.lms_mobile_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        drawerToggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.Dashboard:
                    {
                        Toast.makeText(Dashboard.this, "Dash Board Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    case R.id.lecturematerial:
                    {
                        Toast.makeText(Dashboard.this, "Lecture Materials Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    case R.id.lectureshedules:
                    {
                        Toast.makeText(Dashboard.this, "Lecture Shedules Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    case R.id.grades:
                    {
                        Toast.makeText(Dashboard.this, "Grades Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    case R.id.logout:
                    {
                        Toast.makeText(Dashboard.this, "Logout Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
        super.onBackPressed();
    }
}