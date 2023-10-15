package com.example.assignment3.bookStorecontroller;

import com.example.assignment3.model.Book;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/books")
public class BookStoreController {
    List<Book> listofbook= new ArrayList<>();
    @GetMapping("")
    public List<Book> listOfBooks(){

        Book b1= Book.builder().id(001).title("Java").isbn("yy7").price(24.51).build();
        Book b2= Book.builder().id(002).title("C++").isbn("yy8").price(24.55).build();
        Book b3= Book.builder().id(003).title("WAA").isbn("yy9").price(24.65).build();
        listofbook.add(b1);
        listofbook.add(b2);
        listofbook.add(b3);

        return listofbook;
    }

    @GetMapping("/{id}")
    public Book booksid(@PathVariable int id) throws Exception{
        Optional<Book> book= listofbook.stream().filter(obj -> obj.getId()== id).findFirst();

        //System.out.println(book.get());
        if (book.isPresent()) {
            return book.get();
        }
        else {
            throw new Exception("book list empty");
        }
    }


    @PostMapping("")
    public void addbook(@RequestBody Book b) throws Exception{
//        Book obj1=Book.builder().id(b.getId()).isbn(b.getIsbn()).title(b.getTitle()).price(b.getPrice()).build();
       listofbook.add(b);
        System.out.println(listofbook);
    }

    @PutMapping("/{id}")
    public void booksUpdateId(@PathVariable int id, @RequestBody Book b) throws Exception{

        Optional<Book> bookid= listofbook.stream().filter(obj -> obj.getId()== id).findFirst();
        Book bookgetid=bookid.get();
        bookgetid.setId(b.getId());
        bookgetid.setTitle(b.getTitle());
        bookgetid.setIsbn(b.getIsbn());
        bookgetid.setPrice(b.getPrice());
        System.out.println(listofbook);

    }

    @DeleteMapping("/{id}")
    public void booksDeleteId(@PathVariable int id) throws Exception{

        List<Book> bookid= listofbook.stream().filter(obj -> obj.getId()!= id).collect(Collectors.toList());
        System.out.printf("list : "+bookid);

    }

}
