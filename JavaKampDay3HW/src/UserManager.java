

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý" + user.getName()+ " eklendi ");
		
	}
	public void delete(User user) {
		System.out.println("Kullanýcý"+ user.getName()+" silindi ");
	}
	
	public void addMultiple(User[] userArray) {
		for (User user : userArray) {
			add(user);
}
}
	public void deleteMultiple(User[] userArray) {
		for (User user : userArray) {
			delete(user);
}
}
	
}

