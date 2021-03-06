/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatcompany.commonfiles.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import com.chatcompany.commonfiles.commModels.User;


public interface LoginInterface extends Remote {

    /**
     * used to login
     * @param email user email address
     * @param pass user password
     * @return user bean if succeed ,null if user Already signed IN
     * @throws ResultNotFoundException If mail not found in DB
     * @throws exceptions.WrongPasswordException if wrong password
     * @throws RemoteException if RMI failed
     */
    public User login(String userName, String pass,ClientInterface clientInterface) throws RemoteException;

     /**
     * used to sign up
     *
     * @param user user Data
     * @return true if succeed
     * @throws SQLException if DB failed
     * @throws RemoteException if RMI failed
     *
     */
    public User SignUp(User user,ClientInterface clientInterface) throws SQLException, RemoteException;

}
