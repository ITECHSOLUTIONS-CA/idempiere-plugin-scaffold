/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Copyright (C) 2015 INGEINT <http://www.ingeint.com> and contributors (see README.md file).
 */

package com.ingeint.component;

import com.ingeint.base.CustomCalloutFactory;
import com.ingeint.callout.CPrintPluginInfo;
import com.ingeint.model.MTableDocTemplate;
import com.ingeint.model.MTableTemplate;

/**
 * Callout Factory
 */
public class CalloutFactory extends CustomCalloutFactory {

	/**
	 * For initialize class. Register the custom callout to build
	 * 
	 * <pre>
	 * protected void initialize() {
	 * 	registerCallout(MTableExample.Table_Name, MTableExample.COLUMNNAME_Text, CPrintPluginInfo.class);
	 * }
	 * </pre>
	 */
	@Override
	protected void initialize() {
		registerCallout(MTableDocTemplate.Table_Name, MTableDocTemplate.COLUMNNAME_Description, CPrintPluginInfo.class);
		registerCallout(MTableTemplate.Table_Name, MTableTemplate.COLUMNNAME_Description, CPrintPluginInfo.class);
	}

}
