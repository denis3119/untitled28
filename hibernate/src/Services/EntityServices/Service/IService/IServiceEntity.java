package EntityServices.Service.IService;

import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
public interface IServiceEntity<T> {
    public void deleteById(int id);
    public T getById(int id);
    public List<T> toList();
}
