package kaeit.g334.Nokhrin;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText ta;
    EditText tb;
    TextView lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ta = findViewById(R.id.txt_a);
        tb = findViewById(R.id.txt_b);
        lr = findViewById(R.id.txt_tochka);
    }

    public void my_add_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a + b;


        String sc = String.valueOf(c);
        lr.setText(sc);
    }
    public void my_sub_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a - b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }
    public void my_mul_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a * b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }
    public void my_div_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a / b;
        if (b==0){
            lr.setText("Error");
            return;
        }

        String sc = String.valueOf(c);

        lr.setText(sc);

    }

    public void my_sin_click(View v)
    {
        String sa = ta.getText().toString();

        float a = Float.parseFloat(sa);
        double result = Math.sin(a);

        String sc = String.valueOf(result);
        lr.setText(sc);

    }

    public void my_cos_click(View v)
    {
        String sa = ta.getText().toString();

        float a = Float.parseFloat(sa);
        double result = Math.cos(a);

        String sc = String.valueOf(result);
        lr.setText(sc);

    }

    public void my_tan_click(View v)
    {
        String sa = ta.getText().toString();

        float a = Float.parseFloat(sa);
        double result = Math.tan(a);

        String sc = String.valueOf(result);
        lr.setText(sc);

    }

    public void my_sqrt_click(View v)
    {
        String sa = ta.getText().toString();

        float a = Float.parseFloat(sa);
        double result = Math.sqrt(a);

        String sc = String.valueOf(result);
        lr.setText(sc);

    }
}