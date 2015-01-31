package EntityServices;

import Entity.User;
import EntityServices.Service.IService.IServiceEntity;
import EntityServices.Service.Service;

import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
public class UserService extends Service<User> implements IServiceEntity<User> {

    public final User getById(int id)
    {
        open();
        User user = (User) session.get(User.class,id);
        close();
        return user;
    }

    public void deleteById(int id)
    {
        open();
        User user = (User) session.get(User.class,id);
        session.delete(user);
        close();
    }
    public List<User> toList()
    {
        open();
        List<User> list = (List<User>)session.createQuery("from User as user").list();
        close();
        return list;
    }


}
