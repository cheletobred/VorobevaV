package ru.mirea.vorobevavi.control_lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;

    private CheckBox changer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        changer = findViewById(R.id.Boxic);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 7");
                if (changer.isChecked()){
                    changer.setChecked(false);
                }
                else {
                    changer.setChecked(true);
                }
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void OnebtnItIsNotMe(View view)
    {
        Toast.makeText(this, "Это не я сделал", Toast.LENGTH_SHORT).show();
        textViewStudent.setText("Это не я сделал");
        if (changer.isChecked()){
            changer.setChecked(false);
        }
        else {
            changer.setChecked(true);
        }
    }
}