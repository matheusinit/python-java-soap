package soap;

import org.apache.commons.lang3.StringUtils;

import javax.jws.WebService;
import java.util.Objects;

@WebService(endpointInterface = "soap.Biblioteca")
public class ServerSoap implements Biblioteca {
    Livro[] livros = new Livro[1];
    int size = 0;

    public void adicionarLivro(String name) {
        System.out.println("Adicionar livro");

        Livro livro = new Livro(name);

        if (livros.length == size) {
            Livro[] novoLivrosArray = new Livro[size + 1];

            for (int i = 0; i < livros.length; i++) {
                novoLivrosArray[i] = livros[i];
            }

            livros = novoLivrosArray;
        }


        livros[size] = livro;


        size++;
    }

    public Livro[] listarLivros() {
        return livros;
    }

    public Livro atualizarLivro(String nome, String novoNome) {
        Livro livro = livros[0];

        for (int i = 0; i < livros.length; i++) {
            if (livros[i].nome.equals(nome)) {
                livros[i].nome = novoNome;
                livro = livros[i];
            }
        }

        return livro;
    }
}
