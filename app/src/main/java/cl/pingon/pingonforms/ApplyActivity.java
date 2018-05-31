package cl.pingon.pingonforms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
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
        final Spinner spinner = findViewById(R.id.interestAreaDd);
        final Button sendBt = findViewById(R.id.sendBtn);

        List<String> strings = new ArrayList<>();
        strings.add("Seleccione un área");
        strings.add("Administración");
        strings.add("Operaciones");
        strings.add("Electromecanica");
        strings.add("Operadores");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strings);

        spinner.setAdapter(adapter);

        sendBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = nameEt.getText().toString();
                if (nameEt.getText().toString().length() == 0) {
                    Toast.makeText(ApplyActivity.this, "Debes ingresar tu nombre", Toast.LENGTH_SHORT).show();
                    ;
                    return;
                }

                String phone = phoneEt.getText().toString();
                if (phoneEt.getText().toString().length() == 0) {
                    Toast.makeText(ApplyActivity.this, "Debes ingresar tu telefono", Toast.LENGTH_SHORT).show();
                }
                if (phoneEt.getText().toString().length() <= 9) {
                    Toast.makeText(ApplyActivity.this, "El teléfono debe tener 9 numeros", Toast.LENGTH_SHORT).show();
                    return;
                }

                String mail = mailEt.getText().toString();
                if (mailEt.getText().toString().length() == 0) {
                    Toast.makeText(ApplyActivity.this, "Debes ingresar tu correo", Toast.LENGTH_SHORT).show();
                }
                if (mailEt.getText().toString().length() <= 6) {
                    Toast.makeText(ApplyActivity.this, "Debes ingresar un correo valido", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (spinner.getSelectedItem().toString().trim() == "Seleccione un área") {
                    Toast.makeText(ApplyActivity.this, "Debes seleccionar un área", Toast.LENGTH_SHORT).show();
                } else {
                    String answer = spinner.getSelectedItem().toString();
                    Toast.makeText(ApplyActivity.this, "Estimado/a " + name + ", hemos recibido su solicitud", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }


}
