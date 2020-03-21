package enver.start.android.projectandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2, edit3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.ed_1);
        edit2 = findViewById(R.id.ed_2);
        edit3 = findViewById(R.id.ed_3);

        btn1 = findViewById(R.id.bt_1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        public static void main ();{
            int a = 2;
            int b = 5;
            if (a < b) {
                System.out.println(a < b);
            }


        }
    }
}
