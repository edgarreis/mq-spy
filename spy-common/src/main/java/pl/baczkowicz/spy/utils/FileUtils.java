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
package pl.baczkowicz.spy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * File-related utilities.
 */
public class FileUtils
{
	/** Diagnostic logger. */
	private final static Logger logger = LoggerFactory.getLogger(FileUtils.class);
	

	public static List<File> getDirectoriesWithFile(final String directory, final String fileToFind)
	{
		final List<File> files = new ArrayList<File>();
		
		final File folder = new File(directory);
		File[] listOfFiles = folder.listFiles();

		if (listOfFiles != null)
		{
			for (int i = 0; i < listOfFiles.length; i++)
			{
				if (listOfFiles[i].isDirectory())
				{
					files.addAll(getDirectoriesWithFile(listOfFiles[i].getAbsolutePath(), fileToFind));																			
				}				
				else if (listOfFiles[i].getName().matches(fileToFind))
				{
					files.add(listOfFiles[i]);
				}
			}
		}		
		
		return files;
	}
	
	public static List<File> getFileNamesForDirectory(final String directory, final String extension)
	{
		final List<File> files = new ArrayList<File>();
		
		final File folder = new File(directory);
		File[] listOfFiles = folder.listFiles();

		if (listOfFiles != null)
		{
			for (int i = 0; i < listOfFiles.length; i++)
			{
				if (listOfFiles[i].isFile())
				{
					if (extension == null || extension.isEmpty() ||  listOfFiles[i].getName().endsWith(extension))
					{
						files.add(listOfFiles[i]);
					}
				}
			}
		}
		else
		{
			logger.error("No files in {}", directory);
		}
		
		return files;
	}
	
	public static void writeToFile(final File file, final String value)
	{
		try
		{
			final PrintWriter out = new PrintWriter(file);					
			out.write(value);
			out.close();
		}
		catch (FileNotFoundException e)
		{
			logger.error("Cannot write to file", e);
		}
	}
	
	public static void writeToFile(final File file, final byte[] value)
	{
		try
		{
			Files.write(Paths.get(file.toURI()), value);
		}
		catch (IOException e)
		{
			logger.error("Cannot write to file", e);
		}		
	}
	
	public static InputStream loadFileByName(final String filename) throws IOException
	{
		final File file = new java.io.File(filename);
		if (file.isFile())
		{
			logger.debug("Trying to read {} from filesystem", filename);
			return new FileInputStream(file);
		}
		else
		{
			logger.debug("Trying to read {} from classpath", filename);
			final URL url = FileUtils.class.getResource(filename); 
			if (url != null)
			{
				return url.openStream();
			}
			logger.debug("File {} not found on classpath", filename);
			return null;
		}
	}
}
