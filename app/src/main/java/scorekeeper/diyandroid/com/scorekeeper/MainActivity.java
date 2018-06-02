package scorekeeper.diyandroid.com.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView teamA_score, teamB_score;
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA_score = (TextView) findViewById(R.id.a_score);
        teamB_score = (TextView) findViewById(R.id.b_score);

        //Score Button Listener is set explicitly
        ((Button) findViewById(R.id.reset_scores)).setOnClickListener(this);
        ((Button) findViewById(R.id.plus3_a)).setOnClickListener(this);
        ((Button) findViewById(R.id.plus3_b)).setOnClickListener(this);
        ((Button) findViewById(R.id.plus2_a)).setOnClickListener(this);
        ((Button) findViewById(R.id.plus2_b)).setOnClickListener(this);

        //Free throw/Fouls button listener
        ((Button) findViewById(R.id.freeThrow_a)).setOnClickListener(this);
        ((Button) findViewById(R.id.freeThrow_b)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //Updates the score when score button is pressed
        switch (view.getId()) {
            case R.id.plus3_a:
                scoreA += 3;
                break;
            case R.id.plus3_b:
                scoreB += 3;
                break;
            case R.id.plus2_a:
                scoreA += 2;
                break;
            case R.id.plus2_b:
                scoreB += 2;
                break;
            case R.id.freeThrow_a:
                scoreA += 1;
                break;
            case R.id.freeThrow_b:
                scoreB += 1;
                break;
            case R.id.reset_scores:
                scoreA = 0;
                scoreB = 0;
                break;
        }

        teamA_score.setText(String.valueOf(scoreA));
        teamB_score.setText(String.valueOf(scoreB));
    }
}
