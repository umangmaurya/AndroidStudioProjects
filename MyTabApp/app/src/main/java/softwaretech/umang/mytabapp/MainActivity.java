package softwaretech.umang.mytabapp;

import android.app.Fragment;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {



    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    MyFragmentAdapter mfa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);

        tabLayout= (TabLayout)findViewById(R.id.tablayout);
        viewPager =(ViewPager)findViewById(R.id.pager);

        mfa = new MyFragmentAdapter(getSupportFragmentManager());

        mfa.AddFragment(new Tab1() , "Hello");
        mfa.AddFragment(new Tab2(), "Contacts");
        mfa.AddFragment(new Tab3(),"Blank");

        viewPager.setAdapter(mfa);
        tabLayout.setupWithViewPager(viewPager);


    }
}
