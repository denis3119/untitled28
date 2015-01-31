package EntityServices;

import Entity.Publication;
import EntityServices.Service.IService.IServiceEntity;
import EntityServices.Service.Service;

import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
public class PublicationService extends Service<Publication> implements IServiceEntity<Publication> {
    public Publication getById(int id)
    {
        open();
        Publication publication = (Publication)session.get(Publication.class,id);
        close();
        return publication;
    }

    @Override
    public List<Publication> toList() {
        open();
        List<Publication> list = (List<Publication>)session.createQuery("from Publication as publication").list();
        close();
        return list;
    }

    public void deleteById(int id)
    {
        open();
        Publication publication = (Publication) session.get(Publication.class,id);
        session.delete(publication);
        close();
    }
}
