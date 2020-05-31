package beta;

import org.apache.logging.log4j.*;

public class Demo1 {
	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		log.debug("I am debugging");
		if (5 > 4)
			log.debug("Obj is present");
		log.error("Obj is NOT present");
		log.fatal("This is fatal");
 
	}
}
