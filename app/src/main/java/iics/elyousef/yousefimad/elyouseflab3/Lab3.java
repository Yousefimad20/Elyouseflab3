package iics.elyousef.yousefimad.elyouseflab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;

public class Lab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);

        Button buttonConstraint = (Button)findViewById(R.id.buttonConstraint);
        buttonConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent(getApplicationContext(), Constraint.class);
                startActivity(moveConstraint);

                Intent moveLinear = new Intent(getApplicationContext(), Linear.class);
                startActivity(moveLinear);

                Intent moveRelative = new Intent(getApplicationContext(), Constraint.class);
                startActivity(moveRelative);
            }
        });
    }
}
