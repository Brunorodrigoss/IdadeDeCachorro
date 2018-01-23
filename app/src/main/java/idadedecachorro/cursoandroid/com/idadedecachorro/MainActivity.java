package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaDeTexto;
    private Button botaoDescobrirIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaDeTexto = findViewById(R.id.caixaTextoId);
        botaoDescobrirIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoDescobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorDigitado = caixaDeTexto.getText().toString();

                if(valorDigitado.isEmpty()){
                    resultadoIdade.setText("A idade não pode ser vazia!");
                }else {
                    int valorConvertido = Integer.parseInt(valorDigitado);
                    int resultado = valorConvertido * 7;

                    resultadoIdade.setText("O ano do seu cachorro em anos humanos é " + resultado + " anos");
                }
            }
        });
    }
}
