package edu.upc.eetac.dsa.talker.dao;

import edu.upc.eetac.dsa.talker.entity.Group;
import edu.upc.eetac.dsa.talker.entity.GroupCollection;

import java.sql.SQLException;

/**
 * Created by Sergi1 on 28/10/2015.
 */
public interface GroupDAO {
    public Group createGroup(String grupo_id, String grupo_subject) throws SQLException;
    public Group getGroupById(String id) throws SQLException;
    public GroupCollection getGroups() throws SQLException;
    public Group updateGroup(String id, String subject, String content) throws SQLException;
    public boolean deleteGroup(String id) throws SQLException;
}
