package edu.itstep.myapp_urok4;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FirstFragment extends Fragment {

    private static final String TAG = "==========FirstFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(TAG, "=====onCreateView");

        View v = inflater.inflate(R.layout.first_fragment, container, false);
        Button btn_1 = v.findViewById(R.id.btnFirst);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "=====onClick");
                EditText edt_1 = (EditText) FirstFragment.this.getActivity().findViewById(R.id.edtFirst);
                Toast.makeText(FirstFragment.this.getActivity(), edt_1.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        return v;
    }
}
