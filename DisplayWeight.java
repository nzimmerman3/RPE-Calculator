package zimmerman.nicholas.rpecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayWeight extends AppCompatActivity {

    Button returnToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_weight);
        display();
        returnToMain = (Button) findViewById(R.id.main);
        returnToMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }

    private void display()
    {
            setContentView(R.layout.activity_display_weight);
            TextView t = (TextView) findViewById(R.id.weight_display);
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                return;
            }
            int weight = extras.getInt("w");
            Integer i = new Integer(weight);
            t.setText(i.toString());
            plateMath(weight);
    }

    public void plateMath(int w)
    {
        int left = w;
        int num45 = 0;
        int num35 = 0;
        int num25 = 0;
        int num10 = 0;
        int num5 = 0;
        int num2 = 0;
        if(w < 45)
        {

        }
        else
        {
            left -= 45;
            while(left >= 90)
            {
                num45 += 1;
                left -= 90;
            }
            while(left >= 70)
            {
                num35 += 1;
                left -= 70;
            }
            while(left >= 50)
            {
                num25 += 1;
                left -= 50;
            }
            while(left >= 20)
            {
                num10 += 1;
                left -= 20;
            }
            while(left >= 10)
            {
                num5 += 1;
                left -= 10;
            }
            while(left >= 5)
            {
                num2 += 1;
                left -= 5;
            }
            TextView fortyfive = (TextView) findViewById(R.id.val45);
            TextView thirtyfive = (TextView) findViewById(R.id.val35);
            TextView  twentyfive = (TextView) findViewById(R.id.val25);
            TextView ten = (TextView) findViewById(R.id.val10);
            TextView five = (TextView) findViewById(R.id.val5);
            TextView two = (TextView) findViewById(R.id.val2);

            Integer i_45 = new Integer(num45);
            fortyfive.setText(i_45.toString());
            Integer i_35 = new Integer(num35);
            thirtyfive.setText(i_35.toString());
            Integer i_25 = new Integer(num25);
            twentyfive.setText(i_25.toString());
            Integer i_10 = new Integer(num10);
            ten.setText(i_10.toString());
            Integer i_5 = new Integer(num5);
            five.setText(i_5.toString());
            Integer i_2 = new Integer(num2);
            two.setText(i_2.toString());

        }
    }

}
