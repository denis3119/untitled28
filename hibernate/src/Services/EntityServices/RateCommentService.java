package EntityServices;

import Entity.Rate.RateComment;
import EntityServices.Service.IService.IServiceEntity;
import EntityServices.Service.Service;

import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
public class RateCommentService extends Service<RateComment> implements IServiceEntity<RateComment> {
    public final RateComment getById(int id)
    {
        open();
        RateComment rateComment = (RateComment) session.get(RateComment.class,id);
        close();
        return rateComment;
    }

    public void deleteById(int id)
    {
        open();
        RateComment rateComment = (RateComment) session.get(RateComment.class,id);
        session.delete(rateComment);
        close();
    }
    public List<RateComment> toList()
    {
        open();
        List<RateComment> list = (List<RateComment>)session.createQuery("from RateComment as rateComment").list();
        close();
        return list;
    }
}
