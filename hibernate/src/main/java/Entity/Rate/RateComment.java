package Entity.Rate;

import Entity.*;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
/**
 * Created by denik on 31.01.2015.
 */
@Entity
@Table
@Proxy(lazy = false)
public class RateComment {
    @Id
    @GeneratedValue
    int id;
    int value;
    @ManyToOne
    User user;
    @ManyToOne
    Comment comment;

    public RateComment() {
    }

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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public RateComment(int value, User user, Comment comment) {
        this.value = value;
        this.user = user;
        this.comment = comment;
    }



}
