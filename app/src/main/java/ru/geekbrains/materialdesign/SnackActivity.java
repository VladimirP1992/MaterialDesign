package ru.geekbrains.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class SnackActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";
    TextInputLayout inputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        inputLayout = findViewById(R.id.inputLayout);
    }

    public void onClickButton(View view) {

        Snackbar snackbar = Snackbar.make(view, "message", Snackbar.LENGTH_LONG);

        snackbar.setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";

                Log.d(TAG, "onClick: " + inputLayout.getEditText().getText().toString());
            }
        });


        snackbar.show();
    }
}
