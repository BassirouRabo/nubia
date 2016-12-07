package models;


import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by smalllamartin on 11/19/16.
 */
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "catagory")  //
    private String category;
    @Column(name = "catagory_title")  //
    private String categoryTitle;
    @Column(name = "link")
    private String link;
    @Column(name = "title")
    private String title;
    @Column(name = "auteur")
    private String auteur;
    @Column(name = "overview", length = 5000)
    private String overview;
    @Column(name = "description", length = 5000)
    private String description;
    @Column(name = "image")
    private String image;

    /**
     * Constructor empty
     */
    public Book() {
    }


    /**
     * Find books
     * @return
     */
    public List<Book> findList() {
        try {
            return JPA.em().createQuery("select Book From Book Book").getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Find Book by id
     * @param id
     * @return
     */
    public Book findById(Long id) {
        try {
            return (Book) JPA.em().createQuery("select Book From Book Book WHERE Book.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Find Books by category
     * @param nomCatalog
     * @return
     */
    public List<Book> findByCategory(String nomCatalog) {
        try {
            return  JPA.em().createQuery("select Book From Book Book WHERE Book.category = :nomCatalog").setParameter("nomCatalog", nomCatalog).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
