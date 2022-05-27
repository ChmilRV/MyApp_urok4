package edu.itstep.myapp_urok4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "##### MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = this.getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CalcFragment calcFragment = new CalcFragment();
        fragmentTransaction.add(R.id.flFrameContainer, calcFragment);
        fragmentTransaction.commit();

        Log.d(TAG, "----- onCreate — Активность создается");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,
                "-- onStart — Активность становится " +
                        "видимой для пользователя");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "----- onResume — Активность выходит на передний план");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "----- onPause — Активность уходит с переднего плана");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "----- onStop — Активность перестает быть видимой");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "----- onDestroy — Активность уничтожается");
    }


}
