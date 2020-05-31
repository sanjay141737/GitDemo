package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		log.debug("I am debugging");
		if (5 > 4)
			log.debug("Obj is present");
		log.error("Obj is NOT present");
		log.fatal("This is fatal");
		System.out.println("I am the changes made by Asian guy");
System.out.println("Changes made by american guy");
	}
}
