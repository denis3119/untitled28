package Entity;

import Entity.Rate.RateComment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue
    int id;
    String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<RateComment> getRateComment() {
        return rateComment;
    }

    public void setRateComment(List<RateComment> rateComment) {
        this.rateComment = rateComment;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Comment(String text, List<RateComment> rateComment, Publication publication, User user, int rate) {
        this.text = text;
        this.rateComment = rateComment;
        this.publication = publication;
        this.user = user;
        this.rate = rate;
    }

    @OneToMany(mappedBy = "comment",cascade = CascadeType.PERSIST)
    List<RateComment> rateComment = new ArrayList<RateComment>();
    @ManyToOne
    Publication publication;
    @ManyToOne
    User user;
    int rate=0;
}
