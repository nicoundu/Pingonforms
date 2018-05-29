package cl.pingon.pingonforms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ApplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        final EditText nameEt = findViewById(R.id.nameEt);
        final EditText phoneEt = findViewById(R.id.phoneEt);
        final EditText mailEt = findViewById(R.id.mailEt);
        final RadioGroup applyareaRg = findViewById(R.id.interestareaRg);
        final Button sendBt = findViewById(R.id.sendBt);


    }


}
