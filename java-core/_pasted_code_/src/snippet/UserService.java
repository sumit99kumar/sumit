package snippet;

import java.util.List;

public interface UserService<User> {
	public List listAllUsers();

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	public User findUserById(int id);
}
