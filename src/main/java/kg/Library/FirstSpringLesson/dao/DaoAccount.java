package kg.Library.FirstSpringLesson.dao;

import kg.Library.FirstSpringLesson.model.user.Account;
import kg.Library.FirstSpringLesson.model.user.AddressUser;
import kg.Library.FirstSpringLesson.model.user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoAccount implements kg.Library.FirstSpringLesson.services.DaoAccount {
    GetConnection getConnection = new GetConnection();
    @Override
    public boolean saveAccount(User user, Account account, AddressUser addressUser) {
        Connection connection = getConnection.getConn();
        try {
            Statement statement = connection.createStatement();
            String queryToUser = "insert into user(name,surname,middel_name,date_of_brith) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(queryToUser);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3,user.getMiddleName());
            preparedStatement.setString(4,user.getDate_of_birth());

            String queryToAddress =  "INSERT INTO Addres_user(street_name,num_home) values(?,?)";
            PreparedStatement preparedStatement2 = connection.prepareStatement(queryToAddress);
            preparedStatement2.setString(1,addressUser.getStreetName());
            preparedStatement2.setString(2,addressUser.getNumHome());

            String userId = "SELECT id FROM user c WHERE c.id =";
            int idUser = Integer.parseInt(userId.trim());
            String addressId ="SELECT id FROM Addres_user c WHERE c.id =";
            int idAddress =Integer.parseInt(addressId.trim());
            String ticketId = "SELECT id FROM user c WHERE c.id =";
            int idTick = Integer.parseInt(ticketId.trim());


            String queryToAccount =  "INSERT INTO account(login,password,id_addres_user,id_user,id_ticket) values(?,?,?,?,?)";
            PreparedStatement preparedStatement1 = connection.prepareStatement(queryToAccount);
            preparedStatement1.setString(1,account.getLogin());
            preparedStatement1.setString(2,account.getPassword());
            preparedStatement1.setString(3, String.valueOf(idAddress));
            preparedStatement1.setString(4, String.valueOf(idUser));
            preparedStatement1.setString(5,String.valueOf(idTick));


            int resultSaving = preparedStatement.executeUpdate();
            return resultSaving == 1 ? true : false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkAccount(Account account) {
        return false;
    }


}
