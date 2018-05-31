package cl.pingon.pingonforms;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView background = findViewById(R.id.backgroundIv);
        ImageView icon = findViewById(R.id.pingonIcn);
        TextView title = findViewById(R.id.titleTv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goIndexIntent = new Intent(MainActivity.this, IndexActivity.class);
                startActivity(goIndexIntent);
            }
        }, 1800);
    }
}
