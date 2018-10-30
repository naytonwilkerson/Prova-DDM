package professorangoti.com.interaocomousuario.servico;

import java.util.List;

import professorangoti.com.interaocomousuario.model.Pedido;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PedidoServico {

    @GET("preco")
    Call<List<Pedido>> pegaListaDePedidos();
}
