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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TowerCraneFragment extends Fragment {


    public TowerCraneFragment() {
    }

    public static TowerCraneFragment newInstance() {
        return new TowerCraneFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tower_crane, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText nameinputEt = view.findViewById(R.id.nameinputEt);
        final EditText mailinputEt = view.findViewById(R.id.mailinputEt);
        final Button tcquoteBtn = view.findViewById(R.id.tcquoteBtn);
        final RadioGroup radioGroup = view.findViewById(R.id.towercraneRg);

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

        if (nameinputEt.getText().toString().length() == 0 )
            nameinputEt.setError("Nombre es obligatorio");

        if (mailinputEt.getText().toString().length() == 0 )
            mailinputEt.setError("Correo es obligatorio");


        tcquoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1){

                    RadioButton radioButton = radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();
                    
                } else {
                    Toast.makeText(getContext(), "Debes marcar una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}
