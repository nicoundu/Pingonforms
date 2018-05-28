package cl.pingon.pingonforms;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ApplyFragment extends Fragment {


    public ApplyFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_apply, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup = view.findViewById(R.id.interestareaRg);
        final TextView applyTv = view.findViewById(R.id.applyTv);
        final EditText nameEt = view.findViewById(R.id.nameEt);
        final EditText phoneEt = view.findViewById(R.id.phoneEt);
        final EditText mailEt = view.findViewById(R.id.mailEt);
        final TextView applyareaTv = view.findViewById(R.id.interestareaEt);
        final Button sendBt = view.findViewById(R.id.sendBt);

        applyTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyTv.setVisibility(View.VISIBLE);
                nameEt.setVisibility(View.VISIBLE);
                phoneEt.setVisibility(View.VISIBLE);
                mailEt.setVisibility(View.VISIBLE);
                applyareaTv.setVisibility(View.VISIBLE);
                radioGroup.setVisibility(View.VISIBLE);
                sendBt.setVisibility(View.VISIBLE);

            }
        });

        sendBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                if (id != -1){
                    RadioButton radioButton = radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Debes seleccionar un area", Toast.LENGTH_SHORT).show();
                }
                Intent fragmentIntent = new Intent(Intent.ACTION_SENDTO);
                fragmentIntent.setType("*/*");
                fragmentIntent.setData(Uri.parse("mailto:"));
                fragmentIntent.putExtra(Intent.EXTRA_SUBJECT, "Contacto APP Móvil");
                fragmentIntent.putExtra(Intent.EXTRA_TEXT, nameEt.getText().toString());
                fragmentIntent.putExtra(Intent.EXTRA_TEXT, phoneEt.getText().toString());
                fragmentIntent.putExtra(Intent.EXTRA_TEXT, mailEt.getText().toString());
                startActivity(fragmentIntent);
            }
        });




    }
}
