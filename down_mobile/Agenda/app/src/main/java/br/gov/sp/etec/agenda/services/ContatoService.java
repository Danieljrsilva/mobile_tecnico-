package br.gov.sp.etec.agenda.services;

import java.util.List;

import br.gov.sp.etec.agenda.models.Contato;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by etec on 29/03/19.
 */

public interface ContatoService {

    //Rotas GET, POST, PUT, DELETE

    //GET -> retornar TODOS os contatos
    @GET("contatos")
    Call<List<Contato>> listarTodos();

    //GET -> retorna apenas UM contato
    @GET("contato/{id}")
    Call<Contato> carregarContato(@Path("id") int contatoID);

    //POST -> cadastrar um contato

    //PUT -> alterar um contato

    //DELETE -> excluir um contato

}//fim da interface
