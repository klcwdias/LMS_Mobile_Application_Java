package com.example.lms_mobile_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView mProfilePhoto;
    private TextView mUserName;
    private TextView mCalendar;
    private Button mAddReminderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProfilePhoto = findViewById(R.id.profile_photo);
        mUserName = findViewById(R.id.user_name);
        mCalendar = findViewById(R.id.calendar);
        mAddReminderButton = findViewById(R.id.add_reminder_button);
        // Set the profile photo, user name, and calendar text dynamically if needed

    }
}