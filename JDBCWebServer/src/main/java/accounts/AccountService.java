package accounts;

import dbService.DBException;
import dbService.DBService;
import dbService.dataSets.UsersDataSet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 23.12.2015.
 */
public class AccountService {
    //private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionIdToProfile;
    DBService dbService;

    public AccountService(){
        //loginToProfile = new HashMap<String, UserProfile>();
        sessionIdToProfile = new HashMap<String, UserProfile>();
        dbService = new DBService();
        dbService.printConnectInfo();
    }

    public void addNewUser(UserProfile userProfile){
        try{
            dbService.addUser(userProfile.getLogin(), userProfile.getPass());
            //loginToProfile.put(userProfile.getLogin(), userProfile);
        } catch (DBException e){
            e.printStackTrace();
        }



    }

    public UserProfile getUserByLogin(String login){
        try {
            long id = dbService.findUser(login);
            UsersDataSet dataSet = dbService.getUser(id);
            return new UserProfile(dataSet.getName(), dataSet.getPassword(), "nomail");
        } catch (DBException e){
            e.printStackTrace();
        }
        //return loginToProfile.get(login);
        return null;
    }

    public UserProfile getUserBySessionId(String sessionId){
        return sessionIdToProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile){
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public void deleteSession(String sessionId){
        sessionIdToProfile.remove(sessionId);
    }

}