package edu.itstep.myapp_urok4;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TestFragment extends Fragment {

    private final static String TAG = "===== TestFragment";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "----- onCreateView — Создание набора виджетов Фрагмента");
        return inflater.inflate(R.layout.test_fragment, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "----- onAttach —vФрагмент прикрепляется к Активности");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "----- onCreate — Инициализация Фрагмента");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "----- onActivityCreated — Активность" + " завершила обработку своего события onCreate");
    }

    @Override
    public void onViewStateRestored(Bundle
                                            savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "----- onViewStateRestored — Состояния виджетов" +
                "Фрагмента восстановлены");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "----- onStart — Фрагмент становится видимым для пользователя");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "----- onResume — Фрагмент становится" + " доступным для взаимодействия с пользователем");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "----- onPause — Фрагмент больше не взаимодействует с пользователем");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "----- onStop — Фрагмент более не виден пользователю");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(TAG, "----- onDestroyView — Фрагменту необходимо" +
                        " освободить ресурсы, связанные с его виджетами");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "----- onDestroy — Необходимо выполнить" +
                        " действия по окончательному завершению работы Фрагмента");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,
                "----- onDetach — Сейчас Фрагмент будет " +
                        "откреплен от Активности");
    }


}
