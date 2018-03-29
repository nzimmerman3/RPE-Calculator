package zimmerman.nicholas.rpecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4094504172517162~1899613760");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void load(View view)
    {
        Intent intent = new Intent(this, WeightLoad.class);
        startActivity(intent);
    }

    public void equiv(View view)
    {
        Intent intent = new Intent(this, equivalent.class);
        startActivity(intent);
    }

    public void max(View view)
    {
        Intent intent = new Intent(this, CalculateMax.class);
        startActivity(intent);
    }
}
