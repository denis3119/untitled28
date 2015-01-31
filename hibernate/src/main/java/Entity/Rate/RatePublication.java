package Entity.Rate;

import Entity.Publication;
import Entity.User;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * Created by denik on 31.01.2015.
 */
@Entity
@Table
@Proxy(lazy = false)
public class RatePublication {
    @Id
    @GeneratedValue
    int id;

    public RatePublication() {
    }

    int value;
    @ManyToOne
    User user;
    @ManyToOne
    Publication publication;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public RatePublication(int value, User user, Publication publication) {

        this.value = value;
        this.user = user;
        this.publication = publication;
    }


}
