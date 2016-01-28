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

package com.liferay.portal.tools.shard.builder;

import com.beust.jcommander.Parameter;

import com.liferay.portal.tools.shard.builder.exporter.context.ExportContext;
import com.liferay.portal.tools.shard.builder.internal.validators.CompanyIdsRequiredParameterValidator;
import com.liferay.portal.tools.shard.builder.internal.validators.FileRequiredParameterValidator;
import com.liferay.portal.tools.shard.builder.internal.validators.RequiredParameterValidator;
import com.liferay.portal.tools.shard.builder.internal.validators.WritableFileRequiredParameterValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manuel de la Peña
 */
public class MainParameters {

	public String getCompanies() {
		return _companyIds;
	}

	public String getDatabaseProperties() {
		return _properties;
	}

	public String getOutputDir() {
		return _outputDir;
	}

	public String getSchemaName() {
		return _schemaName;
	}

	public boolean isWriteFile() {
		return _writeFile;
	}

	public ExportContext toExportContext() {
		return new ExportContext(
			_getCompanyIds(), _outputDir, _schemaName, _writeFile);
	}

	private List<Long> _getCompanyIds() {
		String[] companyIds = _companyIds.split(",");

		List<Long> list = new ArrayList<>(companyIds.length);

		for (String companyId : companyIds) {
			list.add(Long.parseLong(companyId));
		}

		return list;
	}

	@Parameter(
		names = {"-C", "--company-ids"},
		validateWith = CompanyIdsRequiredParameterValidator.class
	)
	private String _companyIds;

	@Parameter(
		names = {"-O", "--output-dir"},
		validateWith = WritableFileRequiredParameterValidator.class
	)
	private String _outputDir;

	@Parameter(
		names = {"-P", "--properties"},
		validateWith = FileRequiredParameterValidator.class
	)
	private String _properties;

	@Parameter(
		names = {"-S", "--schema-name"},
		validateWith = RequiredParameterValidator.class
	)
	private String _schemaName;

	@Parameter(names = {"-W", "--write-file"})
	private boolean _writeFile;

}