package devapp.upt.findnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityAcertou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acertou);


        Intent intentRecebido = getIntent();

        TextView texto = findViewById(R.id.TextV2);
        String recebido = intentRecebido.getStringExtra("Key");
        texto.setText(recebido);
    }

    public void onClick(View v){
        finish();
    }


}