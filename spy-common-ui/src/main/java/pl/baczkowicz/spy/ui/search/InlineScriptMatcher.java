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
package pl.baczkowicz.spy.ui.search;

import pl.baczkowicz.spy.scripts.BaseScriptManager;
import pl.baczkowicz.spy.scripts.Script;

public class InlineScriptMatcher extends ScriptMatcher
{
	public InlineScriptMatcher(final BaseScriptManager scriptManager, final String inlineScript)
	{
		super(scriptManager, addAndReturnScript(scriptManager, inlineScript));
	}
	
	public static Script addAndReturnScript(final BaseScriptManager scriptManager, final String inlineScript)
	{
		final Script script = scriptManager.addInlineScript("inline", 
				"function search() "
				+ "{ "
					+ "var payload = message.getPayload(); "
					+ "var formattedPayload = message.getFormattedPayload(); "
				    + "var content = formattedPayload; "
				    + "var topic = message.getTopic(); "
				    + "var qos = message.getQoS(); "
					+ "if (" + inlineScript + ") "
					+ "{ "
						+ "return true; "
					+ "} "
					+ "return false; "
				+ "} "
				+ "search();");
		return script;
	}
}
