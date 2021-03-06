package com.linnik.wickiup.patterns._3_behavioral._1_chain_of_responsibility.live;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author LinnykOleh
 */
public class Live {

	private static final Logger logger = Logger.getLogger(Live.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.FINER);

		final ConsoleHandler consoleHandler = new ConsoleHandler();

		consoleHandler.setLevel(Level.FINER);
		logger.addHandler(consoleHandler);

		logger.finest("finest"); // not print
		logger.finer("finer");
		logger.fine("fine");
	}
}
