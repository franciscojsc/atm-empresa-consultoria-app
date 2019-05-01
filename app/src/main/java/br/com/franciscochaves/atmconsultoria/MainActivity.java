package br.com.franciscochaves.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mBotaoEmpresa;
    private ImageView mBotaoServico;
    private ImageView mBotaoCliente;
    private ImageView mBotaoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotaoEmpresa = findViewById(R.id.image_empresa);
        mBotaoServico = findViewById(R.id.image_servicos);
        mBotaoCliente = findViewById(R.id.image_clientes);
        mBotaoContato = findViewById(R.id.image_contato);

        mBotaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EmpresaActivity.class);
                startActivity(intent);
            }
        });

        mBotaoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ServicoActivity.class);
                startActivity(intent);
            }
        });

        mBotaoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClienteActivity.class);
                startActivity(intent);
            }
        });

        mBotaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContatoActivity.class);
                startActivity(intent);
            }
        });
    }
}
