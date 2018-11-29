package firstClient;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import firstEJB.HelloServiceRemote;

public class HelloService {

	public static void main(String[] args) throws NamingException {
		
		String jndiName="firstEJB/HelloService!firstEJB.HelloServiceRemote";
		/*Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		props.put(Context.PROVIDER_URL, "jnp://localhost:1099");
		Context context = new InitialContext(props);*/
				Context context = new InitialContext();
				HelloServiceRemote proxy = (HelloServiceRemote) context.lookup(jndiName);
				System.out.println(proxy.sayHello("hello"));
				
	}
}
