package cl.pingon.pingonforms;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PlatformsFragment extends Fragment {


    public PlatformsFragment() {
    }

    public static PlatformsFragment newInstance() {
        return new PlatformsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_platforms, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ImageView platformIv = view.findViewById(R.id.platformIv);
        final TextView platformTitleTv = view.findViewById(R.id.platformTitleTv);
        final EditText nameinputEt = view.findViewById(R.id.nameInputEt);
        final EditText mailinputEt = view.findViewById(R.id.mailInputEt);
        final TextView platformRgTitleTv = view.findViewById(R.id.platformRgTitleTv);
        final RadioGroup radioGroup = view.findViewById(R.id.platformRg);
        final Button pfquoteBtn = view.findViewById(R.id.platformQuoteBtn);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button = group.findViewById(checkedId);
                if (button.getTag() != null) {
                    String tag = (String) button.getTag();
                    Toast.makeText(getContext(), tag, Toast.LENGTH_SHORT).show();
                }
            }
        });

        pfquoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameinputEt.setError(null);
                mailinputEt.setError(null);

                String name = nameinputEt.getText().toString();
                if (nameinputEt.getText().toString().length() == 0) {
                    nameinputEt.setError("Nombre es obligatorio");
                    return;
                }

                String mail = mailinputEt.getText().toString();
                if (mailinputEt.getText().toString().length() == 0) {
                    mailinputEt.setError("Correo es obligatorio");
                    return;
                }

                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1) {

                    RadioButton radioButton = radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    Toast.makeText(getContext(), "Estimado/a " + name + ", seleccionaste la plataforma " + answer, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getContext(), "Debes marcar una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
