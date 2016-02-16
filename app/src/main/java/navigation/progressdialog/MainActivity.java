package navigation.progressdialog;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb=(ProgressBar)findViewById(R.id.indeterminate_progress_native);
        pb = new android.widget.ProgressBar(
                getApplicationContext(),
                null,
                android.R.attr.progressBarStyle);
        close=(Button)findViewById(R.id.close);
        pb.setVisibility(View.VISIBLE);
        pb.getIndeterminateDrawable().setColorFilter(000000, android.graphics.PorterDuff.Mode.MULTIPLY);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb.setVisibility(View.GONE);
            }
        });

    }
}
