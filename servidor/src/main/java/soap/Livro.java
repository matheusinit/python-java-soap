package soap;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="livro", propOrder = { "nome" })
public class Livro {
    public String nome;

    public Livro(String nome) {
        this.nome = nome;
    }
}
