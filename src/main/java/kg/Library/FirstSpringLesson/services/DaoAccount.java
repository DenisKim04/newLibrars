package kg.Library.FirstSpringLesson.services;

import kg.Library.FirstSpringLesson.model.user.Account;
import kg.Library.FirstSpringLesson.model.user.AddressUser;
import kg.Library.FirstSpringLesson.model.user.User;

public interface DaoAccount {
    boolean saveAccount(User user , Account account, AddressUser addressUser);
    boolean checkAccount( Account account);

}
