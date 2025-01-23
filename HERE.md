import java.util.List;
import java.util.Date;

class Condominio {
int id;
String nome;
String endereco;
List<Condômino> condôminos;
Sindico sindico;
}

class Sindico {
int id;
String nome;
String email;
String telefone;

    ContratacaoServico solicitarContratacaoServico() {
        return new ContratacaoServico();
    }

    List<Pendencia> visualizarPendencias() {
        // Lógica para retornar pendências
        return null;
    }

    CategoriaProblema categorizarProblema() {
        return new CategoriaProblema();
    }
}

class Condômino {
int id;
String nome;
String email;
String telefone;

    Ticket criarTicket() {
        return new Ticket();
    }

    List<Evento> visualizarEventos() {
        // Lógica para retornar eventos
        return null;
    }

    Avaliacao avaliarFuncionarioServico() {
        return new Avaliacao();
    }
}

class GerenteSindFacil {
int id;
String nome;
String email;
String telefone;

    Condominio cadastrarCondominio() {
        return new Condominio();
    }

    List<Ticket> visualizarTickets() {
        // Lógica para retornar tickets
        return null;
    }

    List<Avaliacao> visualizarAvaliacoes() {
        // Lógica para retornar avaliações
        return null;
    }

    PrestadorServico cadastrarPrestadorServico() {
        return new PrestadorServico();
    }

    Servico cadastrarServico() {
        return new Servico();
    }

    Plano gerenciarPlanosCobrança() {
        return new Plano();
    }
}

class PrestadorServico {
int id;
String nome;
String email;
String telefone;

    HorasServico cadastrarHorasServico() {
        return new HorasServico();
    }
}

class ContratacaoServico {
int id;
PrestadorServico prestadorServico;
Problema problema;
}

class Ticket {
int id;
String descricao;
TipoTicket tipo;
StatusTicket status;
List<Comentario> comentarios;
}

class Comentario {
int id;
String conteudo;
String autor;
}

class Avaliacao {
int id;
int estrelas;
String comentario;
}

class HorasServico {
int id;
Date data;
int quantidadeHoras;
}

class Servico {
int id;
String nome;
String descricao;
}

class Plano {
int id;
String nome;
float preco;
}

class Evento {
int id;
TipoEvento tipo;
String descricao;
}

class Pendencia {
int id;
String descricao;
StatusPendencia status;
}

enum TipoTicket { PROBLEMA, NOTICIA, FEEDBACK }
enum StatusTicket { ABERTO, EM_ANDAMENTO, FECHADO }
enum TipoEvento { NOTICIA, PROBLEMA, FORUM }
enum StatusPendencia { PENDENTE, RESOLVIDA, CANCELADA }
enum CategoriaProblema { INFRAESTRUTURA, SEGURANÇA, COMUNICAÇÃO, ADMINISTRATIVO }