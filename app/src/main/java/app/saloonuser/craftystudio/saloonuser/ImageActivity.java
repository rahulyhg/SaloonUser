package app.saloonuser.craftystudio.saloonuser;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import utils.CustomPagerAdapter;
import utils.Saloon;

public class ImageActivity extends AppCompatActivity {

    ViewPager mViewPager;
    CustomPagerAdapter mCustomPagerAdapter;

    Saloon saloon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        saloon = (Saloon) bundle.getSerializable("Saloon");
        //saloon = (Saloon) getIntent().getExtras().getSerializable("Saloon");

        mCustomPagerAdapter = new CustomPagerAdapter(this, saloon);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);


    }
}
