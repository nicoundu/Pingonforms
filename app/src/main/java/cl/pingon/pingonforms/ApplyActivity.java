package cl.pingon.pingonforms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ApplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        final EditText nameEt = findViewById(R.id.nameEt);
        final EditText phoneEt = findViewById(R.id.phoneEt);
        final EditText mailEt = findViewById(R.id.mailEt);
        final Spinner spinner = findViewById(R.id.interestareaDd);
        final Button sendBt = findViewById(R.id.sendBt);

        List<String> strings = new ArrayList<>();
        strings.add("Seleccione un área");
        strings.add("Administración");
        strings.add("Operaciones");
        strings.add("Electromecanica");
        strings.add("Operadores");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strings);

        spinner.setAdapter(adapter);

        if (nameEt.getText().toString().length() == 0 )
            nameEt.setError("Nombre es obligatorio");

        if (phoneEt.getText().toString().length() == 0 )
            phoneEt.setError("Teléfono es obligatorio");

        if (mailEt.getText().toString().length() == 0 )
            mailEt.setError("Correo es obligatorio");

        sendBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().trim() == "Seleccione un área") {
                    Toast.makeText(ApplyActivity.this, "Debes seleccionar un área", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }






}
