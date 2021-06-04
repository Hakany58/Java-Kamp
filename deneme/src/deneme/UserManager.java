package deneme;

public class UserManager implements UserManagerDao{

	@Override
	public void add(User user) {
		
		System.out.println("Kullanýcý eklendi " + user.getAd());
		
	}

}
