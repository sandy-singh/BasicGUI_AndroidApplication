package com.example.sandyhelloworld;

//import statements
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Widgets
    RadioGroup rg;
    RadioButton rb;
    Button btn;

    //On create add Listener button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }


    public void addListenerOnButton() {

        //get values
        rg = (RadioGroup) findViewById(R.id.radionames);
        btn = (Button) findViewById(R.id.button);

        //When Click
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // selected radio group
                int selectedId = rg.getCheckedRadioButtonId();

                // radiobutton with returned id
                rb = (RadioButton) findViewById(selectedId);

                //If/Else to check the user input
                if(rb.getText().equals("Samwell Tarly") ) {
                    Toast.makeText(getApplicationContext(),
                            "Correct Answer",
                            Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Answer",
                            Toast.LENGTH_SHORT).show();
                }


            }

        });
    }

}
