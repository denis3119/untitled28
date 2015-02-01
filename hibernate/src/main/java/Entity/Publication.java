package Entity;

import Entity.Rate.RatePublication;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
@Entity
@Table
@Proxy(lazy = false)
public class Publication{
    @Id
    @GeneratedValue
    int id;
    String title;
    String text;
    String code;
    int rate=0;
    @OneToMany(mappedBy = "publication",cascade = CascadeType.PERSIST,orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    List<RatePublication> ratePublication = new ArrayList<RatePublication>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public List<RatePublication> getRatePublication() {
        return ratePublication;
    }

    public void setRatePublication(List<RatePublication> ratePublication) {
        this.ratePublication = ratePublication;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Publication() {

    }

    @OneToMany(mappedBy = "publication",cascade = CascadeType.PERSIST,orphanRemoval = true)
    List<Comment> comments = new ArrayList<Comment>();

    public Publication(String title, String text, String code, int rate, List<RatePublication> ratePublication, List<Comment> comments, User user) {
        this.title = title;
        this.text = text;
        this.code = code;
        this.rate = rate;
        this.ratePublication = ratePublication;
        this.comments = comments;
        this.user = user;
    }

    @ManyToOne
    User user;
}
