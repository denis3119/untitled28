package EntityServices.Service.IService;

/**
 * Created by denik on 31.01.2015.
 */
public interface IService<T> {
    public void add(T entity);
    public void delete(T entity);
    public void update(T entity);

}
