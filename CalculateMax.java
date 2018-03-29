package zimmerman.nicholas.rpecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculateMax extends AppCompatActivity {

    double rpe;
    int max;
    int reps;
    int weight;
    double[][] chart = new double[][]{
            {.88, .85, .82, .80, .77, .75, .72, .69, .67, .64},
            {.89, .86, .84, .81, .79, .76, .74, .71, .68, .65},
            {.91, .88, .85, .82, .80, .77, .75, .72, .69, .67},
            {.92, .89, .86, .84, .81, .79, .76, .74, .71, .68},
            {.94, .91, .88, .85, .82, .80, .77, .75, .72, .69},
            {.96, .92, .89, .86, .84, .81, .79, .76, .74, .71},
            {.98, .94, .91, .88, .85, .82, .80, .77, .75, .72},
            {1.0, .96, .92, .89, .86, .84, .81, .79, .76, .74}
    };

    EditText rpeInput;
    EditText repsInput;
    EditText weightInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_max);

        rpeInput = (EditText) findViewById(R.id.RPEinput);
        repsInput = (EditText) findViewById(R.id.repsInput);
        weightInput = (EditText) findViewById(R.id.weightInput);


    }

    private int calculateMax(double rpe_d, int reps_d, int weight_d)
    {
        rpe_d = (rpe_d - 6.5)*2;
        int row = (int) rpe_d;
        int w = (int) (weight_d/(chart[row][reps_d-1]));
        return 5*(Math.round(w/5));
    }

    public void displayMax(View view){
        Intent intent = new Intent(this, DisplayMax.class);
        if (ready())
        {
            rpe = Double.valueOf(rpeInput.getText().toString());
            reps = Integer.valueOf(repsInput.getText().toString());
            weight = Integer.valueOf(weightInput.getText().toString());
            rpe = roundToHalf(rpe);

            if(rpe < 6.5 || reps > 10 || rpe > 10 || reps < 1 || weight < 1)
            {

            }
            else
            {
                max = calculateMax(rpe, reps, weight);
                intent.putExtra("m", max);
                startActivity(intent);
            }
        }
    }
    public boolean ready()
    {
        if(rpeInput.getText().toString().trim().isEmpty()||repsInput.getText().toString().trim().isEmpty()|| weightInput.getText().toString().trim().isEmpty() )
            return false;
        else
            return true;

    }
    public void back(View view)
    {
        finish();
    }

    public static double roundToHalf(double d){
        return Math.round(d * 2) / 2.0;
    }

    public void makeCalculation()
    {}
}
