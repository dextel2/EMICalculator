package karanke.net.emicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText edPAmount;
    private EditText edROI;
    private EditText edYears;
    private Button btnCalculate;
    private TextView txtAnswer;
    private String str;
    private double edPAmountt,edROII,edYearss,edAnss,EMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPAmount = (EditText)findViewById(R.id.edPAmount);
        edROI = (EditText)findViewById(R.id.edROI);
        edYears = (EditText)findViewById(R.id.edYears);
        btnCalculate = (Button)findViewById(R.id.btnCalculate);
        txtAnswer = (TextView)findViewById(R.id.txtAnswer);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                For Reference
//                num1 = Double.parseDouble(edNumberOne.getText().toString());

                edPAmountt = Double.parseDouble(edPAmount.getText().toString());
                edROII = Double.parseDouble(edROI.getText().toString());
                edYearss = Double.parseDouble(edYears.getText().toString());



                edAnss = (edPAmountt*edYearss*edROII)/100;
                EMI = (edAnss+edPAmountt)/(edYearss*12);
                txtAnswer.setText(" = "+EMI);
            }
        });


    }
}
