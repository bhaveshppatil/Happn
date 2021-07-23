package com.example.happnclone.MainLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.happnclone.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Layout_MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout,new MeetFragment()).commit();


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.notificationbottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {

                Fragment temp = null;
                switch (item.getItemId()){
                    case R.id.Meet: temp = new MeetFragment();
                        break;
                    case R.id.chat: temp = new ChatFragment();
                        break;
                    case R.id.Profile: temp= new ProfileFragment();
                        break;
                    case R.id.Notification: temp = new NotificationFragment();
                        break;
                    case R.id.Location: temp = new LocationFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout,temp).commit();


                return true;
            }
        });
    }
}