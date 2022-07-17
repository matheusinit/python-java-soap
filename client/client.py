from zeep import Client

class Livro:
    pass

def novoLivro():
    ret = Livro()
    ret.nome = input('Digite o nome do livro: ')
    return ret

def main():
    client = Client('http://127.0.0.1:5000/biblioteca?wsdl')
    print('### Biblioteca de Livros')
    while True:
        print('\nMENU:')
        print('1) Inserir Livro')
        print('2) Listar Livros')
        print('0) Sair')
        op = input('> ')
        if op == '1':
            livro = novoLivro()
            client.service.adicionarLivro(
                livro.nome
            )
        elif op == '2':
            ls = client.service.listarLivros()
            for livro in ls:
                print('')
                print('Nome do livro: ', livro.nome)
        elif op == '0':
            break
        else:
            print('Opcao invalida!')

if __name__ == '__main__':
    main()