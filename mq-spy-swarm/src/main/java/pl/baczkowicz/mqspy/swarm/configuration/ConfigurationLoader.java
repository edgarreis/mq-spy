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
package pl.baczkowicz.mqspy.swarm.configuration;

import java.io.File;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.baczkowicz.mqspy.daemon.configuration.MqSpyDaemonConstants;
import pl.baczkowicz.mqspy.swarm.generated.configuration.MqSpySwarmConfiguration;
import pl.baczkowicz.mqttspy.daemon.configuration.MqttSpyDaemonConstants;
import pl.baczkowicz.mqttspy.utils.MqttConfigurationUtils;
import pl.baczkowicz.spy.configuration.PropertyFileLoader;
import pl.baczkowicz.spy.exceptions.XMLException;
import pl.baczkowicz.spy.xml.XMLParser;

/**
 * Helper class for loading the swarm's configuration.
 */
public class ConfigurationLoader extends PropertyFileLoader
{
	/** Diagnostic logger. */
	private final static Logger logger = LoggerFactory.getLogger(ConfigurationLoader.class);
	
	/** XML config parser. */
	private final XMLParser parser;

	/** Swarm's configuration (once parsed). */
	private MqSpySwarmConfiguration configuration;

	// private ProtocolEnum protocol;
	
	/**
	 * Creates the loader. 
	 * 
	 * @throws XMLException Thrown if cannot read the properties file or instantiate the config parser
	 */
	public ConfigurationLoader() throws XMLException
	{
		super();
		readFromClassPath(MqSpySwarmConstants.DEFAULT_PROPERTIES_FILE_NAME);
		
		this.parser = new XMLParser(MqSpySwarmConstants.PACKAGE, 
				new String[] {	MqttConfigurationUtils.SPY_COMMON_SCHEMA, 
								MqttConfigurationUtils.MQTT_COMMON_SCHEMA,
								MqttSpyDaemonConstants.SCHEMA,
								MqSpyDaemonConstants.SCHEMA,
								MqSpySwarmConstants.SCHEMA});					
	}
	
	/**
	 * Loads configuration from the given file.
	 * 
	 * @param file The file to load from
	 * 
	 * @return True if all OK
	 */
	public boolean loadConfiguration(final File file)
	{
		try
		{
			configuration = (MqSpySwarmConfiguration) parser.loadFromFile(file);	
			// populateDefaults();
			return true;
		}
		catch (XMLException e)
		{							
			logger.error("Cannot process the configuration file at " + file.getAbsolutePath(), e);
		}
		catch (FileNotFoundException e)
		{
			logger.error("Cannot read the configuration file from " + file.getAbsolutePath(), e);
		}
		
		return false;
	}
//
//	/**
//	 * Populates the connection configuration with default values.
//	 */
//	private void populateDefaults()
//	{
//		// Check if MQTT has been configured
//		final DaemonMqttConnectionDetails mqttConnection = configuration.get().getMqttConnection();
//		
//		// Check if JMS has been configured
//		final DaemonJmsConnectionDetails jmsConnection = configuration.getConnectivity().getJmsConnection();
//		
//		// Check if STOMP has been configured
//		final DaemonStompConnectionDetails stompConnection = configuration.getConnectivity().getStompConnection();
//				
//		if (mqttConnection != null)		
//		{
//			protocol = ProtocolEnum.MQTT;
//			MqttConfigurationUtils.populateMessageLogDefaults(mqttConnection.getMessageLog());
//			MqttSpyDaemonConfigLoader.populateDaemonDefaults(mqttConnection.getBackgroundScript());
//			MqttSpyDaemonConfigLoader.generateClientIdIfMissing(mqttConnection);
//		}				
//		else if (jmsConnection != null)
//		{
//			protocol = ProtocolEnum.JMS;
//		}
//		else if (stompConnection != null)
//		{
//			protocol = ProtocolEnum.STOMP;
//		}
//	}

	/**
	 * Gets the configuration value.
	 * 
	 * @return The daemon's configuration
	 */
	public MqSpySwarmConfiguration getConfiguration()
	{
		return configuration;
	}
}
