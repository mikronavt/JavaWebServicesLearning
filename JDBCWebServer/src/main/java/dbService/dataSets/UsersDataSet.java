package dbService.dataSets;

/**
 * Created by User on 29.12.2015.
 */
@SuppressWarnings("UnusedDeclaration")
public class UsersDataSet {
    private long id;
    private String login;
    private String password;

    public UsersDataSet(long id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;

    }

    public String getName(){
        return login;
    }

    public long getId(){
        return id;
    }

    public String getPassword(){return password;}

    @Override
    public String toString(){
        return "UsersDataSet{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass=" + password +
                '}';
    }
}
