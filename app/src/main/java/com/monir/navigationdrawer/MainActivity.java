package com.monir.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = findViewById(R.id.navigation_drawer);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawer,R.string.nav_open,R.string.nav_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.homeIcon){
            Toast.makeText(this, "Home is Clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.profileIcon){
            Toast.makeText(this, "Profile is Clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.chatIcon){
            Toast.makeText(this, "Chat is Clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.shareIcon){
            Toast.makeText(this, "Share is Clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.contactIcon){
            Toast.makeText(this, "Contact is Clicked", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}