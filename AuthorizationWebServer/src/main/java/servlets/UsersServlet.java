package servlets;

import accounts.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 23.12.2015.
 */
public class UsersServlet extends HttpServlet {
    @SuppressWarnings({"FieldCanBeLocal", "UnusedDeclaration"}) //todo: remove after module 2 home work
    private final AccountService accountService;

    public UsersServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    //get public user profile
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //sign up
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //change profile
    public void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //unregister
    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
