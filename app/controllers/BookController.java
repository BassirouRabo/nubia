package controllers;

import models.Book;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smalllamartin on 11/19/16.
 */
public class BookController extends Controller {

    @Transactional
    public Result readsByCatalog(String nomCatalog) {
        List<Book> bookList = new Book().findByCategory(nomCatalog);

        if(null == bookList) {
            bookList = new ArrayList<>();
        }
        return ok(books.render(bookList));
    }

    @Transactional
    public Result readByCatalog(String nomCatalog, Long id) {
        Book bookSingle = new Book().findById(id);

        if(null == bookSingle) {
            return redirect("/catalogs/"+nomCatalog+"/books");
        }

        List<Book> bookList = new Book().findByCategory(nomCatalog);

        if(null == bookList) {
            bookList = new ArrayList<>();
        }


        return ok(book.render(bookSingle, bookList));
    }


}
