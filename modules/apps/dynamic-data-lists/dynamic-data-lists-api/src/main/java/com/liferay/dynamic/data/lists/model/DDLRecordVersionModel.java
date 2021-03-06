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

package com.liferay.dynamic.data.lists.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DDLRecordVersion service. Represents a row in the &quot;DDLRecordVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordVersion
 * @see com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionImpl
 * @see com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionModelImpl
 * @generated
 */
@ProviderType
public interface DDLRecordVersionModel extends BaseModel<DDLRecordVersion>,
	MVCCModel, ShardedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ddl record version model instance should use the {@link DDLRecordVersion} interface instead.
	 */

	/**
	 * Returns the primary key of this ddl record version.
	 *
	 * @return the primary key of this ddl record version
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ddl record version.
	 *
	 * @param primaryKey the primary key of this ddl record version
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this ddl record version.
	 *
	 * @return the mvcc version of this ddl record version
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this ddl record version.
	 *
	 * @param mvccVersion the mvcc version of this ddl record version
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the record version ID of this ddl record version.
	 *
	 * @return the record version ID of this ddl record version
	 */
	public long getRecordVersionId();

	/**
	 * Sets the record version ID of this ddl record version.
	 *
	 * @param recordVersionId the record version ID of this ddl record version
	 */
	public void setRecordVersionId(long recordVersionId);

	/**
	 * Returns the group ID of this ddl record version.
	 *
	 * @return the group ID of this ddl record version
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this ddl record version.
	 *
	 * @param groupId the group ID of this ddl record version
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ddl record version.
	 *
	 * @return the company ID of this ddl record version
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ddl record version.
	 *
	 * @param companyId the company ID of this ddl record version
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ddl record version.
	 *
	 * @return the user ID of this ddl record version
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this ddl record version.
	 *
	 * @param userId the user ID of this ddl record version
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ddl record version.
	 *
	 * @return the user uuid of this ddl record version
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ddl record version.
	 *
	 * @param userUuid the user uuid of this ddl record version
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ddl record version.
	 *
	 * @return the user name of this ddl record version
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this ddl record version.
	 *
	 * @param userName the user name of this ddl record version
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ddl record version.
	 *
	 * @return the create date of this ddl record version
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this ddl record version.
	 *
	 * @param createDate the create date of this ddl record version
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the ddm storage ID of this ddl record version.
	 *
	 * @return the ddm storage ID of this ddl record version
	 */
	public long getDDMStorageId();

	/**
	 * Sets the ddm storage ID of this ddl record version.
	 *
	 * @param DDMStorageId the ddm storage ID of this ddl record version
	 */
	public void setDDMStorageId(long DDMStorageId);

	/**
	 * Returns the record set ID of this ddl record version.
	 *
	 * @return the record set ID of this ddl record version
	 */
	public long getRecordSetId();

	/**
	 * Sets the record set ID of this ddl record version.
	 *
	 * @param recordSetId the record set ID of this ddl record version
	 */
	public void setRecordSetId(long recordSetId);

	/**
	 * Returns the record set version of this ddl record version.
	 *
	 * @return the record set version of this ddl record version
	 */
	@AutoEscape
	public String getRecordSetVersion();

	/**
	 * Sets the record set version of this ddl record version.
	 *
	 * @param recordSetVersion the record set version of this ddl record version
	 */
	public void setRecordSetVersion(String recordSetVersion);

	/**
	 * Returns the record ID of this ddl record version.
	 *
	 * @return the record ID of this ddl record version
	 */
	public long getRecordId();

	/**
	 * Sets the record ID of this ddl record version.
	 *
	 * @param recordId the record ID of this ddl record version
	 */
	public void setRecordId(long recordId);

	/**
	 * Returns the version of this ddl record version.
	 *
	 * @return the version of this ddl record version
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this ddl record version.
	 *
	 * @param version the version of this ddl record version
	 */
	public void setVersion(String version);

	/**
	 * Returns the display index of this ddl record version.
	 *
	 * @return the display index of this ddl record version
	 */
	public int getDisplayIndex();

	/**
	 * Sets the display index of this ddl record version.
	 *
	 * @param displayIndex the display index of this ddl record version
	 */
	public void setDisplayIndex(int displayIndex);

	/**
	 * Returns the status of this ddl record version.
	 *
	 * @return the status of this ddl record version
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this ddl record version.
	 *
	 * @param status the status of this ddl record version
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this ddl record version.
	 *
	 * @return the status by user ID of this ddl record version
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this ddl record version.
	 *
	 * @param statusByUserId the status by user ID of this ddl record version
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this ddl record version.
	 *
	 * @return the status by user uuid of this ddl record version
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this ddl record version.
	 *
	 * @param statusByUserUuid the status by user uuid of this ddl record version
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this ddl record version.
	 *
	 * @return the status by user name of this ddl record version
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this ddl record version.
	 *
	 * @param statusByUserName the status by user name of this ddl record version
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this ddl record version.
	 *
	 * @return the status date of this ddl record version
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this ddl record version.
	 *
	 * @param statusDate the status date of this ddl record version
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this ddl record version is approved.
	 *
	 * @return <code>true</code> if this ddl record version is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this ddl record version is denied.
	 *
	 * @return <code>true</code> if this ddl record version is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this ddl record version is a draft.
	 *
	 * @return <code>true</code> if this ddl record version is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this ddl record version is expired.
	 *
	 * @return <code>true</code> if this ddl record version is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this ddl record version is inactive.
	 *
	 * @return <code>true</code> if this ddl record version is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this ddl record version is incomplete.
	 *
	 * @return <code>true</code> if this ddl record version is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this ddl record version is pending.
	 *
	 * @return <code>true</code> if this ddl record version is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this ddl record version is scheduled.
	 *
	 * @return <code>true</code> if this ddl record version is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DDLRecordVersion ddlRecordVersion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DDLRecordVersion> toCacheModel();

	@Override
	public DDLRecordVersion toEscapedModel();

	@Override
	public DDLRecordVersion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}