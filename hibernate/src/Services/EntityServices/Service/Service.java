package EntityServices.Service;

import Hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by denik on 31.01.2015.
 */
public class Service<T> {
    protected Session session;
    protected void open()
   {
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
   }
   protected void close()
   {
       session.getTransaction().commit();
       session.close();

   }
   public void add(T entity)
   {
       open();
        session.save(entity);
       close();

   }
    public void delete(T entity)
    {
        open();
        session.delete(entity);
        close();
    }
    public void update(T entity)
    {
        open();
        session.saveOrUpdate(entity);
        close();
    }

}
