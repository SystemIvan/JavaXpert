import java.time.LocalDateTime;
import java.util.List;

public class OrdemServico {
    String defeito, status, observacoes;
    int prioridade;
    LocalDateTime dataEntrada, previsao, dataSaida;
    Equipamento equipamento;
    Cliente cliente;
    Tecnico responsavel;
    List<Servico> servicos;
}
