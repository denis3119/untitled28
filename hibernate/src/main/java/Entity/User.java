package Entity;

import Entity.Rate.RateComment;
import Entity.Rate.RatePublication;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    int id;

    String Name;
    String Password;
    String Role;
    boolean blocked=false;

    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    List<RateComment> rateComments = new ArrayList<RateComment>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    List<RatePublication> ratePublication = new ArrayList<RatePublication>();


    public List<RateComment> getRateComments() {
        return rateComments;
    }

    public void setRateComments(List<RateComment> rateComments) {
        this.rateComments = rateComments;
    }

    public List<RatePublication> getRatePublication() {
        return ratePublication;
    }

    public void setRatePublication(List<RatePublication> ratePublication) {
        this.ratePublication = ratePublication;
    }



    public User(String name, String password, String role, boolean blocked, List<RateComment> rateComments, List<RatePublication> ratePublication, List<Publication> publications, List<Comment> comments) {
        Name = name;
        Password = password;
        Role = role;
        this.blocked = blocked;
        this.rateComments = rateComments;
        this.ratePublication = ratePublication;
        this.publications = publications;
        this.comments = comments;
    }

    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    List<Publication> publications = new ArrayList<Publication>();

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    List<Comment> comments= new ArrayList<Comment>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications){
        this.publications = publications;
    }

    public User() {

    }


}
