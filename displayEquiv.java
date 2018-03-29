package zimmerman.nicholas.rpecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class displayEquiv extends AppCompatActivity {
    double[] chart = new double[] {1.0, .96, .92, .89, .86, .84, .81, .79, .76, .74, .72, .70};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_equiv);
        display();
    }

    public void display()
    {
        Bundle extras = getIntent().getExtras();
        if(extras == null)
        {
            return;
        }
        int max = extras.getInt("m");

        Integer oneI = max;
        TextView one = (TextView) findViewById(R.id.one);
        one.setText(oneI.toString());

        Integer twoI = (int)Math.round(chart[1]*max);
        TextView two = (TextView) findViewById(R.id.two);
        two.setText(twoI.toString());

        Integer threeI = (int)Math.round(chart[2]*max);
        TextView three = (TextView) findViewById(R.id.three);
        three.setText(threeI.toString());

        Integer fourI = (int)Math.round(chart[3]*max);
        TextView four = (TextView) findViewById(R.id.four);
        four.setText(fourI.toString());

        Integer fiveI = (int)Math.round(chart[4]*max);
        TextView five = (TextView) findViewById(R.id.five);
        five.setText(fiveI.toString());

        Integer sixI = (int)Math.round(chart[5]*max);
        TextView six = (TextView) findViewById(R.id.six);
        six.setText(sixI.toString());

        Integer sevenI = (int)Math.round(chart[6]*max);
        TextView seven = (TextView) findViewById(R.id.seven);
        seven.setText(sevenI.toString());

        Integer eightI = (int)Math.round(chart[7]*max);
        TextView eight = (TextView) findViewById(R.id.eight);
        eight.setText(eightI.toString());

        Integer nineI = (int)Math.round(chart[8]*max);
        TextView nine = (TextView) findViewById(R.id.nine);
        nine.setText(nineI.toString());

        Integer tenI = (int)Math.round(chart[9]*max);
        TextView ten = (TextView) findViewById(R.id.ten);
        ten.setText(tenI.toString());

        Integer elevenI = (int)Math.round(chart[10]*max);
        TextView eleven = (TextView) findViewById(R.id.eleven);
        eleven.setText(elevenI.toString());

        Integer twelveI = (int)Math.round(chart[11]*max);
        TextView twelve = (TextView) findViewById(R.id.twelve);
        twelve.setText(twelveI.toString());

    }
}
