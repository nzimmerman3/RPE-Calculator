package zimmerman.nicholas.rpecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static zimmerman.nicholas.rpecalculator.R.id.returnToMain;

public class DisplayMax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_max);
        display();

    }

    private void display()
    {
        setContentView(R.layout.activity_display_max);
        TextView t = (TextView) findViewById(R.id.max_display);
        Bundle extras = getIntent().getExtras();
        if(extras == null)
        {
            return;
        }
        int max = extras.getInt("m");
        Integer i = new Integer(max);
        t.setText(i.toString());
    }

    public void returnToMain(View view)
    {
        finish();
    }



}


