package soap;

import javax.jws.WebService;
import java.util.List;
import java.util.Vector;

@WebService(endpointInterface = "soap.Biblioteca")
public class ServerSoap implements Biblioteca {
    List<Livro> livros = new Vector<>();

    public void adicionarLivro(String name) {
        System.out.println("Adicionar livro");

        Livro livro = new Livro(name);

        livros.add(livro);
    }

    public Livro[] listarLivros() {
        return (Livro[]) livros.toArray();
    }

    public Livro atualizarLivro(String nome, String novoNome) {
        Livro livro = livros.get(0);

        for (Livro item : livros) {
            if (item.nome == nome) {
                item.nome = nome;

                livro = item;
            }
        }

        return livro;
    }
}
