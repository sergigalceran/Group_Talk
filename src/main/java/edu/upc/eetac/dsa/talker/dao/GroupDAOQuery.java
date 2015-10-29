package edu.upc.eetac.dsa.talker.dao;

/**
 * Created by Sergi1 on 28/10/2015.
 */
public class GroupDAOQuery {
    public final static String UUID = "select REPLACE(UUID(),'-','')";
    public final static String CREATE_GROUP = "insert into grupo (grupo_id, type_grupo) values (UNHEX(?), unhex(?), ?, ?)";
    public final static String GET_GROUP_BY_ID = "select hex(s.id) as id, hex(s.userid) as userid, s.content, s.subject, s.creation_timestamp, s.last_modified, u.fullname from stings s, users u where s.id=unhex(?) and u.id=s.userid";
    public final static String GET_GROUP = "select hex(id) as id, hex(userid) as userid, subject, creation_timestamp, last_modified from stings where creation_timestamp < ? order by creation_timestamp desc limit 5";
    //public final static String GET_GROUP_AFTER = "select hex(id) as id, hex(userid) as userid, subject, creation_timestamp, last_modified from stings  where creation_timestamp > ? order by creation_timestamp desc limit 5";
    public final static String UPDATE_GROUP = "update stings set subject=?, content=? where id=unhex(?) ";
    public final static String DELETE_GROUP = "delete from stings where id=unhex(?)";
}
