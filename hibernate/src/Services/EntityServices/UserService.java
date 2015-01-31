package EntityServices;

import Entity.Publication;
import Entity.User;
import EntityServices.Service.Service;

/**
 * Created by denik on 31.01.2015.
 */
public class UserService extends Service<User> {
    private final User getById(int id)
    {
        open();
        User user = (User) session.get(User.class,id);
        close();
        return user;
    }
    public void addPublication(int userId, Publication publication){
        open();
        User user = (User) session.get(User.class,userId);
        publication.setUser(user);
        new PublicationService().add(publication);
        close();
    }

}
