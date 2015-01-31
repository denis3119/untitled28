package EntityServices;

import Entity.Comment;
import EntityServices.Service.IService.IServiceEntity;
import EntityServices.Service.Service;

import java.util.List;

/**
 * Created by denik on 31.01.2015.
 */
public class CommentService extends Service<Comment> implements IServiceEntity<Comment> {
    @Override
    public void deleteById(int id) {
        open();
        Comment comment = (Comment) session.get(Comment.class,id);
        session.delete(comment);
        close();
    }

    @Override
    public final Comment getById(int id)
    {
        open();
        Comment comment = (Comment) session.get(Comment.class,id);
        close();
        return comment;
    }

    @Override
    public List<Comment> toList() {
        open();
        List<Comment> list = (List<Comment>)session.createQuery("from Comment as comment").list();
        close();
        return list;
    }
}
