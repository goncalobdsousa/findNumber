package devapp.upt.findnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int valorRandom;
    private int contTent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valorRandom = (int) ((Math.random() * (9 - 1)) + 1);
        contTent = 0;
    }

    @Override
    protected void onResume() {
        super.onResume();
        valorRandom = (int) ((Math.random() * (9 - 1)) + 1);
        contTent = 0;
    }


    public void recebeNumber(View V){
        TextView TV1 = findViewById(R.id.TextV1);
        TextView plText = findViewById(R.id.inserirNumber);
        int numeroInserido = Integer.parseInt(plText.getText().toString());
        String referenciaActivity = "Key";
        if(numeroInserido == valorRandom){
                Intent intent = new Intent(this, ActivityAcertou.class);
                intent.putExtra(referenciaActivity, "Acertou");
                startActivity(intent);
            }else if(numeroInserido > valorRandom){
                contTent ++;
                TV1.setText(R.string.Maior);
            }else {
                contTent ++;
                TV1.setText(R.string.Menor);
            }
            if (contTent == 3){
                Intent intent = new Intent(this, ActivityAcertou.class);
                intent.putExtra(referenciaActivity, "ooops");
                startActivity(intent);
        }


    }
}