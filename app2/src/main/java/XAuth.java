//import java.io.Serializable;
//
//import javax.enterprise.context.SessionScoped;
//
//import br.gov.frameworkdemoiselle.security.Authenticator;
//import br.gov.frameworkdemoiselle.security.User;
//
//@SessionScoped
//public class XAuth implements Authenticator, Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	private Boolean auth;
//
//	private User user;
//
//	// @Inject
//	// private Credentials credentials;
//
//	public XAuth() {
//		auth = false;
//	}
//
//	@Override
//	public boolean authenticate() {
//		System.out.println(auth);
//		auth = true;
//
//		user = new User() {
//
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			public void setAttribute(Object key, Object value) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public String getId() {
//				// TODO Auto-generated method stub
//				return "xxx";
//			}
//
//			@Override
//			public Object getAttribute(Object key) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//
//		return auth;
//	}
//
//	@Override
//	public void unAuthenticate() {
//		auth = false;
//		user = null;
//	}
//
//	@Override
//	public User getUser() {
//		return user;
//	}
//
//}
