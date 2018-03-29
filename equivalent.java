package zimmerman.nicholas.rpecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class equivalent extends AppCompatActivity {

    EditText repsInput;
    EditText weightInput;
    int weight;
    int reps;

    double[] chart = new double[] {1.0, .96, .92, .89, .86, .84, .81, .79, .76, .74, .72, .70};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equivalent);

        repsInput = (EditText) findViewById(R.id.repsIn);
        weightInput = (EditText) findViewById(R.id.weightIn);

    }

    public int calculateMax(int r, int w)
    {
        return (int)(w/(chart[r - 1]));
    }

    public void display(View view)
    {
        if(ready())
        {
            Intent intent = new Intent(this, displayEquiv.class);
            reps = Integer.valueOf(repsInput.getText().toString());
            weight = Integer.valueOf(weightInput.getText().toString());
            if(reps > 0 && reps < 13 && weight > 0)
            {
                int max = calculateMax(reps, weight);
                intent.putExtra("m", max);
                startActivity(intent);
            }

        }

    }
    public void back(View view)
    {
        finish();
    }

    public boolean ready()
    {
        if(repsInput.getText().toString().trim().isEmpty()||weightInput.getText().toString().trim().isEmpty())
            return false;
        else
            return true;
    }


}
