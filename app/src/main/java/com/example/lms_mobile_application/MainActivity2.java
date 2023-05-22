package com.example.lms_mobile_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private Toolbar mToolbar;
    private ImageView mProfilePhoto;

    private String[] mMenuTitles = {"Dashboard", "Lecture Materials", "Lecture Schedule", "Grades", "Logout"};
    private int[] mMenuIcons = {R.drawable.ic_baseline_home_24, R.drawable.ic_baseline_menu_book_24,
            R.drawable.ic_baseline_calendar_month_24, R.drawable.ic_baseline_stacked_line_chart_24, R.drawable.ic_baseline_logout_24};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Set up the toolbar
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        // Set up the app drawer
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerList = findViewById(R.id.drawer_list);
        mProfilePhoto = findViewById(R.id.profile_photo);

        // Set the adapter for the drawer list
        DrawerListAdapter adapter = new DrawerListAdapter(this, mMenuTitles, mMenuIcons);
        mDrawerList.setAdapter(adapter);

        // Handle item click events in the drawer list
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Perform action based on the selected item
                switch (position) {
                    case 0:
                        // Dashboard selected
                        Toast.makeText(MainActivity2.this, "Dashboard selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        // Lecture Materials selected
                        Toast.makeText(MainActivity2.this, "Lecture Materials selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        // Lecture Schedule selected
                        Toast.makeText(MainActivity2.this, "Lecture Schedule selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        // Grades selected
                        Toast.makeText(MainActivity2.this, "Grades selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        // Logout selected
                        Toast.makeText(MainActivity2.this, "Logout selected", Toast.LENGTH_SHORT).show();
                        break;
                }

                // Close the drawer after item selection
                mDrawerLayout.closeDrawers();
            }
        });
    }
}

