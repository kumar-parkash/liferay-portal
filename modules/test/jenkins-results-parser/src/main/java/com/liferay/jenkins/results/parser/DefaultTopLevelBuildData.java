/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.jenkins.results.parser;

/**
 * @author Michael Hashimoto
 */
public class DefaultTopLevelBuildData extends BaseTopLevelBuildData {

	public DefaultTopLevelBuildData() {
		this(null, null);
	}

	public DefaultTopLevelBuildData(String runID) {
		this(runID, null);
	}

	public DefaultTopLevelBuildData(String runID, String buildURL) {
		super(runID, buildURL);
	}

	@Override
	protected String getType() {
		return _TYPE;
	}

	private static final String _TYPE = "top_level";

}