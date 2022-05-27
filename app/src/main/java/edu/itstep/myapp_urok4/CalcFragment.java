package edu.itstep.myapp_urok4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class CalcFragment extends Fragment {

    private final static String TAG = "=== CalcFragment";

    private EditText edtOne;
    private EditText edtTwo;
    private TextView tvResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        View calcView = inflater.inflate(R.layout.calc_fragment, container, false);

        this.edtOne = (EditText) calcView.findViewById(R.id.edtOne);
        this.edtTwo = (EditText) calcView.findViewById(R.id.edtTwo);
        this.tvResult = (TextView) calcView.findViewById(R.id.tvResult);

        (calcView.findViewById(R.id.btnPlus)).setOnClickListener(this::onClick);
        (calcView.findViewById(R.id.btnMinus)).setOnClickListener(this::onClick);
        (calcView.findViewById(R.id.btnDiv)).setOnClickListener(this::onClick);
        (calcView.findViewById(R.id.btnMult)).setOnClickListener(this::onClick);

        return calcView;
    }

    public void onClick(View v) {

        try {
            double one = Double.parseDouble(this.edtOne.getText().toString());
            double two = Double.parseDouble(this.edtTwo.getText().toString());
            double result = 0;
            switch (v.getId()) {
                case R.id.btnPlus:
                    result = one + two;
                    break;
                case R.id.btnMinus:
                    result = one - two;
                    break;
                case R.id.btnDiv:
                    result = one / two;
                    break;
                case R.id.btnMult:
                    result = one * two;
                    break;
            }

            this.tvResult.setText(String.valueOf(result));
        } catch (Exception e) {
            Toast.makeText(this.getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
