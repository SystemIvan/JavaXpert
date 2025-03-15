import java.time.LocalDateTime;
import java.util.List;

public class OrdemServico {
    private String defeito, observacoes;
    private PrioridadeEnum prioridade;
    private LocalDateTime dataEntrada, previsao, dataSaida;
    private Equipamento equipamento;
    private Cliente cliente;
    private Tecnico responsavel;
    private List<Servico> servicos;
    private StatusEnum status;
}
