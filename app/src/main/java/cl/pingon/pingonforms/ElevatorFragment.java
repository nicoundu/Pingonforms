package cl.pingon.pingonforms;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ElevatorFragment extends Fragment {

    public ElevatorFragment() {
    }

    public static ElevatorFragment newInstance() {
        return new ElevatorFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_elevator, container, false);
    }
}
