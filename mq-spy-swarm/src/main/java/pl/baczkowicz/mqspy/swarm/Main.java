/***********************************************************************************
 * 
 * Copyright (c) 2015 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 * The Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */
package pl.baczkowicz.mqspy.swarm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.baczkowicz.mqspy.swarm.Main;
import pl.baczkowicz.mqspy.swarm.MqSpySwarm;
import pl.baczkowicz.spy.exceptions.SpyException;
import pl.baczkowicz.spy.exceptions.XMLException;

/**
 * The main class of the swarm.
 */
public class Main
{
	/** Diagnostic logger. */
	private final static Logger logger = LoggerFactory.getLogger(Main.class);
	
	/**
	 * The main method, taking one parameter.
	 * 
	 * @param The args - should contain only one argument with the configuration file location
	 */
	public static void main(String[] args)
	{
		final MqSpySwarm swarm = new MqSpySwarm();
		
		try
		{		
			swarm.initialise();
			
			if (args.length != 1)
			{
				logger.error("Expecting only 1 parameter with the configuration file location");
				return;
			}	
									
			swarm.loadAndRun(args[0]);
		}
		catch (XMLException e)
		{
			logger.error("Cannot load the swarm's configuration", e);
		}
		catch (SpyException e)
		{
			logger.error("Error occurred while connecting to broker", e);
		}		
	}		
}
