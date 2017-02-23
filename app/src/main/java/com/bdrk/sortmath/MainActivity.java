package com.bdrk.sortmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int[] scores = {0, 8, 2, 4, 6, 7, 1, 9, 12, 4, 10, 22};
    private StringBuffer strScores = new StringBuffer();
    private TextView tvSortResult;
    private Button btnBubble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSortResult = (TextView) findViewById(R.id.tv_sort_result);
        btnBubble = (Button) findViewById(R.id.btn_bubble);

        for (int i = 0; i < scores.length; i++) {
            strScores.append(scores[i] + '\t');
        }
        tvSortResult.setText(strScores);


        btnBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] result = SortUtil.bubbleSort(scores);
                strScores = new StringBuffer();
                for (int i = 0; i < result.length; i++) {
                    strScores.append(result[i] + '\t');
                }
                tvSortResult.setText(strScores);
            }
        });
    }
}
