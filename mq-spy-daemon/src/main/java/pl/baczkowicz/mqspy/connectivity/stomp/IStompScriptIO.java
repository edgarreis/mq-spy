/***********************************************************************************
 * 
 * Copyright (c) 2014 Kamil Baczkowicz
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
package pl.baczkowicz.mqspy.connectivity.stomp;

import pl.baczkowicz.spy.scripts.IScriptIO;

/**
 * Interface between a script and the mqttspy object, primarily used for publishing messages.
 */
public interface IStompScriptIO extends IScriptIO
{
	boolean subscribe(final String topic);
	
	boolean unsubscribe(final String topic);
	
	/**
	 * Publishes a message with the given payload to the given topic (qos = 0; retained = false).
	 * 
	 * @param publicationTopic The publication topic
	 * @param payload The payload of the message
	 */
	void publish(final String publicationTopic, final String payload);
}