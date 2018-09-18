package com.example.ritakamil.inmobi_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.sdk.InMobiSdk.LogLevel;
import com.inmobi.ads.InMobiAdRequestStatus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InMobiSdk.init(this, "389ca4c59f6741f7b1e96e4af3f42b3f");
        //InMobiAdRequest
        InMobiBanner bannerAd = (InMobiBanner)findViewById(R.id.banner);
        bannerAd.load();


    }
}
