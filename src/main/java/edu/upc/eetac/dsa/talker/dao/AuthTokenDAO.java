package edu.upc.eetac.dsa.talker.dao;

import edu.upc.eetac.dsa.talker.auth.UserInfo;
import edu.upc.eetac.dsa.talker.entity.AuthToken;

import java.sql.SQLException;

/**
 * Created by Sergi1 on 28/10/2015.
 */
public interface AuthTokenDAO {
    public UserInfo getUserByAuthToken(String token) throws SQLException;
    public AuthToken createAuthToken(String userid) throws SQLException;
    public void deleteToken(String userid) throws  SQLException;
}
