package firstEJB;

import javax.ejb.Remote;

@Remote
public interface HelloServiceRemote {

	String sayHello(String msg);
}
