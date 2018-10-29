package professorangoti.com.interaocomousuario.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import professorangoti.com.interaocomousuario.R;
import professorangoti.com.interaocomousuario.model.Pedido;

public class PedidoActivity extends AppCompatActivity {

    private TextView precoPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        precoPedido = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        Pedido pedido = null;

        if (bundle != null) {
            pedido = (Pedido) bundle.getSerializable("pedido");
        }

        if (pedido != null) {
            precoPedido.setText(pedido.getValor());
        }

    }
}
