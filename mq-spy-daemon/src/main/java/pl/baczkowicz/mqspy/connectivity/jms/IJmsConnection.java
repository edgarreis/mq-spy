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
package pl.baczkowicz.mqspy.connectivity.jms;

import pl.baczkowicz.spy.connectivity.IConnection;

/** 
 * Basic interface for interacting with a JMS connection.
 */
public interface IJmsConnection extends IConnection
{
	/**
	 * Attempts a subscription to the given topic.
	 * 
	 * @param topic Subscription topic
	 */
	boolean subscribe(final String topic);
	
	/**
	 * Attempts to unsubscribe from the given topic.
	 * 
	 * @param topic Subscription topic
	 */
	boolean unsubscribe(final String topic);
	
	/** 
	 * Checks if a message can be published (e.g. client is connected).
	 * 
	 * @return True if publication is possible
	 */
	boolean canPublish();
	
	void publish(final String publicationTopic, final String data);	
}
