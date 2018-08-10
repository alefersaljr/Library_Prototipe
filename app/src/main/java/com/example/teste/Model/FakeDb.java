package com.example.teste.Model;

import com.example.teste.Model.VO.Book;

import java.util.List;

public class FakeDb {
    private Book book;
    public static List<Book> list;

    public FakeDb(){

        book = new Book();

        book.setId(1);
        book.setUrl("http://bestfantasybooks.com/blog/wp-content/uploads/2013/02/lotr.png");
        book.setName("The Lord Of The Rings");
        book.setAutor("J.R.R. Tolkien");
        book.setDescricao("Este é um teste de preenchimento do campo da breve sinopse do livro que foi escolhido. Nesta tela é possível verificar maiores informações deste livro, abaixo pode-se verificar algumas paginas do livro.");

        book.setId(2);
        book.setUrl("http://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608873869/the-hobbit-9781608873869_hr.jpg");
        book.setName("The Hobbit");
        book.setAutor("J.R.R. Tolkien");
        book.setDescricao("TESTE");

        book.setId(3);
        book.setUrl("https://vignette.wikia.nocookie.net/harrypotter/images/c/c6/Harry_potter_HBP_Scholastic_edition.jpg/revision/latest?cb=20051228060531");
        book.setName("Harry Potter, The Half-Blood Prince");
        book.setAutor("J.K. Rowling");
        book.setDescricao("TESTE");

        book.setId(4);
        book.setUrl("https://upload.wikimedia.org/wikipedia/pt/thumb/7/7e/O_Ladr%C3%A3o_de_Raios.jpg/230px-O_Ladr%C3%A3o_de_Raios.jpg");
        book.setName("Percy Jackson, The Lightning Thief");
        book.setAutor("Rick Riordan");
        book.setDescricao("TESTE");

        book.setId(5);
        book.setUrl("http://2.bp.blogspot.com/-gtj1F8eOYBg/UaVrCENvhMI/AAAAAAAAAHs/8vKhr8uDKrw/s1600/Cover+heroes+of+olympus+%231+-+The+lost+hero+.jpg");
        book.setName("The Lost Hero");
        book.setAutor("Rick Riordan");
        book.setDescricao("TESTE");

        book.setId(6);
        book.setUrl("http://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781781084557/sherlock-holmes-and-the-servants-of-hell-9781781084557_hr.jpg");
        book.setName("Sherlock Holmes, The Servants Of Hell");
        book.setAutor("Paul Kane");
        book.setDescricao("TESTE");

        book.setId(7);
        book.setUrl("https://http2.mlstatic.com/audio-livro-dom-casmurro-machado-de-assis-D_NQ_NP_680256-MLB27189786642_042018-F.jpg");
        book.setName("Dom Casmurro");
        book.setAutor("Machado De Assis");
        book.setDescricao("TESTE");

        book.setId(8);
        book.setUrl("https://upload.wikimedia.org/wikipedia/pt/thumb/8/8d/The_Wolf_of_Wall_Street.jpg/250px-The_Wolf_of_Wall_Street.jpg");
        book.setName("The Wolf Of The Wall Street");
        book.setAutor("Jordan Belfort");
        book.setDescricao("TESTE");

        book.setId(9);
        book.setUrl("https://www.portaldoslivreiros.com.br/imagens/34555/PL34555.jpg");
        book.setName("The Alchemist");
        book.setAutor("Paulo Coelho");
        book.setDescricao("TESTE");

        book.setId(10);
        book.setUrl("https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG");
        book.setName("The Little Prince");
        book.setAutor("Antoine De Saint-Exupéry");
        book.setDescricao("TESTE");

    }
}
