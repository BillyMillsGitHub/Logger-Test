package LoggerTest.java;

import java.util.logging.*;

public class loggerTest {


		private final static Logger LOGGER = Logger.getLogger(loggerTest.class.getName());

		public static void main(String[] args) {

			 LOGGER.log(Level.INFO, "This is my first log Message --> TEST");
			 ((Logger) LOGGER).info("This is my second log message --> TEST");


		}

	}