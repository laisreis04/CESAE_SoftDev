package Ex_03;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        UserSessionManager sessionManager1 = UserSessionManager.getInstance();
        System.out.println("Token de acesso: " + sessionManager1.getSessionToken());
        System.out.println("Último acesso: " + sessionManager1.getLastAccess());


        sleep(1000);
        System.out.println("Loading...1%");
        sleep(1000);
        System.out.println("Loading...2%");
        sleep(1000);
        System.out.println("Loading...3%");
        sleep(1000);
        System.out.println("Loading...4%");
        sleep(1000);
        System.out.println("Loading...5%");

        sessionManager1.setLastAccess();

        System.out.println("Token de acesso: " + sessionManager1.getSessionToken());
        System.out.println("Último acesso: " + sessionManager1.getLastAccess());

    }
}
