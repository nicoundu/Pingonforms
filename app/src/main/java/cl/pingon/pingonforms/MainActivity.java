package cl.pingon.pingonforms;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goindexIntent = new Intent(MainActivity.this, IndexActivity.class );
                startActivity(goindexIntent);
            }
        }, 1800);
    }
}
