package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout limain = (LinearLayout) findViewById(R.id.Main);

        addEditText(limain);

        Button proses = new Button(this);
        proses.setText("PROSES");
        limain.addView(proses);
        final TextView tvhasil = new TextView(this);
        limain.addView(tvhasil);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText etnama = (EditText) limain.getChildAt(0);
                EditText etumur = (EditText) limain.getChildAt(1);

                String nama = etnama.getText().toString();
                String umur = etumur.getText().toString();

                tvhasil.setText(nama + " umur " + umur + " tahun");

            }
        });


    }

    private void addEditText(LinearLayout limain) {

        for (int i = 0; i <= 5; i++) {

            final EditText etnama = new EditText(this);
            limain.addView(etnama);
            etnama.setHint(" Isikan Nama Anak");


            final EditText etumur = new EditText(this);
            limain.addView(etumur);
            etumur.setHint(" Isikan Umur");
            etumur.setInputType(InputType.TYPE_CLASS_NUMBER);


        }


    }
}
