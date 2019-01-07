package com.source.getbus1;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BerandaActivity extends AppCompatActivity {

    //ImageButton b1;
    //RelativeLayout cs=findViewById(R.id.constraint);
    //Display cs = getWindowManager().getDefaultDisplay();
    TextView waktu,halte,rute,asal,tujuan;
    ImageView bus;
    Button login,saklar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Beranda"));
        tabLayout.addTab(tabLayout.newTab().setText("Peta IPB"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        saklar=findViewById(R.id.button);
        login=findViewById(R.id.login);
        waktu=findViewById(R.id.waktu);
        halte=findViewById(R.id.halte);
        rute=findViewById(R.id.rute);
        asal=findViewById(R.id.asal);
        tujuan=findViewById(R.id.tujuan);
        bus=findViewById(R.id.bus);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login.getText().toString().matches("LOGIN DRIVER")) {
                    startActivity(new Intent(BerandaActivity.this, LoginActivity.class));
                }
                else{
                    login.setText("LOGIN DRIVER");
                    saklar.setVisibility(View.INVISIBLE);
                    saklar.setText("OFF");
                    waktu.setText("15 : 30");
                    rute.setText("Merah");
                    halte.setText("Berlin");
                    asal.setText("Fapeta");
                    tujuan.setText(halte.getText());
                }
            }
        });

        saklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(saklar.getText().toString().matches("OFF")){
                    saklar.setText("ON");
                    waktu.setText("00 : 00");
                    rute.setText("--");
                    halte.setText("--");
                    asal.setText("--");
                    tujuan.setText(halte.getText());
                }
                else{
                    saklar.setText("OFF");
                    waktu.setText("15 : 30");
                    rute.setText("Merah");
                    halte.setText("Berlin");
                    asal.setText("Fapeta");
                    tujuan.setText(halte.getText());
                }
            }
        });

        //b1.setLayoutParams(new LinearLayout.LayoutParams(cs.getWidth()/1, (b1.getHeight()*cs.getWidth())/b1.getWidth()));

        waktu.setText("15 : 30");
        rute.setText("Merah");
        halte.setText("Berlin");
        asal.setText("Fapeta");
        tujuan.setText(halte.getText());
        gerakBus();
    }

    public void gerakBus(){
        TranslateAnimation animation = new TranslateAnimation(0, 250, 0, 0);
        animation.setDuration(5000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new MyAnimationListener());
        bus.startAnimation(animation);
    }

    private class MyAnimationListener implements Animation.AnimationListener {

        @Override
        public void onAnimationEnd(Animation animation) {
            bus.clearAnimation();
            ConstraintLayout.LayoutParams lp = (ConstraintLayout.LayoutParams) bus.getLayoutParams();
            bus.setLayoutParams(lp);
            gerakBus();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

    }

    /*@Override
    public boolean onCreateOptionsMenu(){//Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
