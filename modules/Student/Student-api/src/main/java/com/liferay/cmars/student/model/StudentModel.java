/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Student service. Represents a row in the &quot;CMARS_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.cmars.student.model.impl.StudentImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
@ProviderType
public interface StudentModel
	extends BaseModel<Student>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link Student} interface instead.
	 */

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this student.
	 *
	 * @return the uuid of this student
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this student.
	 *
	 * @param uuid the uuid of this student
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the student ID of this student.
	 *
	 * @return the student ID of this student
	 */
	public long getStudentId();

	/**
	 * Sets the student ID of this student.
	 *
	 * @param studentId the student ID of this student
	 */
	public void setStudentId(long studentId);

	/**
	 * Returns the group ID of this student.
	 *
	 * @return the group ID of this student
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this student.
	 *
	 * @param groupId the group ID of this student
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this student.
	 *
	 * @return the company ID of this student
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this student.
	 *
	 * @param companyId the company ID of this student
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this student.
	 *
	 * @return the user ID of this student
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this student.
	 *
	 * @param userId the user ID of this student
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this student.
	 *
	 * @return the user uuid of this student
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this student.
	 *
	 * @param userUuid the user uuid of this student
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this student.
	 *
	 * @return the user name of this student
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this student.
	 *
	 * @param userName the user name of this student
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this student.
	 *
	 * @return the create date of this student
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this student.
	 *
	 * @param createDate the create date of this student
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this student.
	 *
	 * @return the modified date of this student
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this student.
	 *
	 * @param modifiedDate the modified date of this student
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the student code of this student.
	 *
	 * @return the student code of this student
	 */
	@AutoEscape
	public String getStudentCode();

	/**
	 * Sets the student code of this student.
	 *
	 * @param studentCode the student code of this student
	 */
	public void setStudentCode(String studentCode);

	/**
	 * Returns the student name of this student.
	 *
	 * @return the student name of this student
	 */
	@AutoEscape
	public String getStudentName();

	/**
	 * Sets the student name of this student.
	 *
	 * @param studentName the student name of this student
	 */
	public void setStudentName(String studentName);

	/**
	 * Returns the student email of this student.
	 *
	 * @return the student email of this student
	 */
	@AutoEscape
	public String getStudentEmail();

	/**
	 * Sets the student email of this student.
	 *
	 * @param studentEmail the student email of this student
	 */
	public void setStudentEmail(String studentEmail);

	/**
	 * Returns the student phone of this student.
	 *
	 * @return the student phone of this student
	 */
	@AutoEscape
	public String getStudentPhone();

	/**
	 * Sets the student phone of this student.
	 *
	 * @param studentPhone the student phone of this student
	 */
	public void setStudentPhone(String studentPhone);

	/**
	 * Returns the student gender of this student.
	 *
	 * @return the student gender of this student
	 */
	@AutoEscape
	public String getStudentGender();

	/**
	 * Sets the student gender of this student.
	 *
	 * @param studentGender the student gender of this student
	 */
	public void setStudentGender(String studentGender);

	/**
	 * Returns the student address of this student.
	 *
	 * @return the student address of this student
	 */
	@AutoEscape
	public String getStudentAddress();

	/**
	 * Sets the student address of this student.
	 *
	 * @param studentAddress the student address of this student
	 */
	public void setStudentAddress(String studentAddress);

	/**
	 * Returns the field1 of this student.
	 *
	 * @return the field1 of this student
	 */
	@AutoEscape
	public String getField1();

	/**
	 * Sets the field1 of this student.
	 *
	 * @param field1 the field1 of this student
	 */
	public void setField1(String field1);

	/**
	 * Returns the field2 of this student.
	 *
	 * @return the field2 of this student
	 */
	public boolean getField2();

	/**
	 * Returns <code>true</code> if this student is field2.
	 *
	 * @return <code>true</code> if this student is field2; <code>false</code> otherwise
	 */
	public boolean isField2();

	/**
	 * Sets whether this student is field2.
	 *
	 * @param field2 the field2 of this student
	 */
	public void setField2(boolean field2);

	/**
	 * Returns the field3 of this student.
	 *
	 * @return the field3 of this student
	 */
	public int getField3();

	/**
	 * Sets the field3 of this student.
	 *
	 * @param field3 the field3 of this student
	 */
	public void setField3(int field3);

	/**
	 * Returns the field4 of this student.
	 *
	 * @return the field4 of this student
	 */
	public Date getField4();

	/**
	 * Sets the field4 of this student.
	 *
	 * @param field4 the field4 of this student
	 */
	public void setField4(Date field4);

	/**
	 * Returns the field5 of this student.
	 *
	 * @return the field5 of this student
	 */
	@AutoEscape
	public String getField5();

	/**
	 * Sets the field5 of this student.
	 *
	 * @param field5 the field5 of this student
	 */
	public void setField5(String field5);

	@Override
	public Student cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}