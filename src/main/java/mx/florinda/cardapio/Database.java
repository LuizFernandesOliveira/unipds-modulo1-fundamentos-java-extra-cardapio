package mx.florinda.cardapio;

import java.math.BigDecimal;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;

public interface Database {
  List<ItemCardapio> listaItensCardapio();

  Optional<ItemCardapio> itemCardapioPorId(Long id);

  boolean removeItemCardapio(Long id);

  boolean alteraPrecoItemCardapio(Long id, BigDecimal novoPreco);

  int totalItensCardapio();

  void adicionaItemCardapio(ItemCardapio item);
}
