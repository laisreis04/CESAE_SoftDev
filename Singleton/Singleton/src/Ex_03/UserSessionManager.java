package Ex_03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {

    private  int sessionToken;
    private String lastAccess;

    private static UserSessionManager instance;

    private UserSessionManager() {

        Random random = new Random();

        this.sessionToken = random.nextInt(1,1000);
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }

  public static UserSessionManager getInstance(){
        if(instance == null){
            instance = new UserSessionManager();
        }
        return instance;

}

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess() {
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }
}
