package jp.suntech.s21007.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick =findViewById(R.id.bt_click);
        HelloListener listener=new HelloListener();
        btClick.setOnClickListener(listener);

        Button btNClear=findViewById(R.id.bt_NameClear);
        Button btPClear=findViewById(R.id.bt_PosClear);
        btNClear.setOnClickListener(listener);
        btPClear.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText N_input=findViewById(R.id.etName);
            EditText P_input=findViewById(R.id.etPos);
            TextView output=findViewById(R.id.tvOutput);

            int id=view.getId();
            switch (id){
                case R.id.bt_click:
                    String inputNStr=N_input.getText().toString();
                    String inputPStr=P_input.getText().toString();
                    output.setText(inputPStr+"にお住いの"+inputNStr+"さん、こんにちは!");
                    break;
                case R.id.bt_NameClear:
                    N_input.setText("");
                    output.setText("");
                    break;
                case R.id.bt_PosClear:
                    P_input.setText("");
                    output.setText("");
                    break;
            }
        }
    }

}