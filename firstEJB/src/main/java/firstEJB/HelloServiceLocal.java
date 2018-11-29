package firstEJB;

import javax.ejb.Local;

@Local
public interface HelloServiceLocal {

	String sayHello(String msg);
}
