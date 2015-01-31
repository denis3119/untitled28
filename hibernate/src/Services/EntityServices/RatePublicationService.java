package EntityServices;

import Entity.Rate.RatePublication;
import EntityServices.Service.IService.IServiceEntity;
import EntityServices.Service.Service;

import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
public class RatePublicationService extends Service<RatePublication> implements IServiceEntity<RatePublication> {
    public final RatePublication getById(int id)
    {
        open();
        RatePublication ratePublication = (RatePublication) session.get(RatePublication.class,id);
        close();
        return ratePublication;
    }

    public void deleteById(int id)
    {
        open();
        RatePublication ratePublication = (RatePublication) session.get(RatePublication.class,id);
        session.delete(ratePublication);
        close();
    }
    public List<RatePublication> toList()
    {
        open();
        List<RatePublication> list = (List<RatePublication>)session.createQuery("from RatePublication as ratePublication").list();
        close();
        return list;
    }
}
