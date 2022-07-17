package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Biblioteca {
    @WebMethod void adicionarLivro(String name);
    @WebMethod Livro[] listarLivros();

    @WebMethod Livro atualizarLivro(String nome, String novoNome);
}
