/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service;

import com.liferay.cmars.student.model.Student;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Student. This utility wraps
 * <code>com.liferay.cmars.student.service.impl.StudentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StudentLocalService
 * @generated
 */
public class StudentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.cmars.student.service.impl.StudentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Student addStudent(
			long userId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addStudent(
			userId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student the student
	 * @return the student that was added
	 */
	public static Student addStudent(Student student) {
		return getService().addStudent(student);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	public static Student createStudent(long studentId) {
		return getService().createStudent(studentId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 */
	public static Student deleteStudent(long studentId) throws PortalException {
		return getService().deleteStudent(studentId);
	}

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student the student
	 * @return the student that was removed
	 */
	public static Student deleteStudent(Student student) {
		return getService().deleteStudent(student);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Student fetchStudent(long studentId) {
		return getService().fetchStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	public static Student fetchStudentByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchStudentByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student with the primary key.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws PortalException if a student with the primary key could not be found
	 */
	public static Student getStudent(long studentId) throws PortalException {
		return getService().getStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student
	 * @throws PortalException if a matching student could not be found
	 */
	public static Student getStudentByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getStudentByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	public static List<Student> getStudents(int start, int end) {
		return getService().getStudents(start, end);
	}

	/**
	 * Returns all the students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @return the matching students, or an empty list if no matches were found
	 */
	public static List<Student> getStudentsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getStudentsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching students, or an empty list if no matches were found
	 */
	public static List<Student> getStudentsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Student> orderByComparator) {

		return getService().getStudentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	public static int getStudentsCount() {
		return getService().getStudentsCount();
	}

	public static List<Student> searchStudentAddress(String studentAddress)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentAddress(studentAddress);
	}

	public static List<Student> searchStudentAddress(
			String studentAddress, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentAddress(studentAddress, start, end);
	}

	public static List<Student> searchStudentAddress(
			String studentAddress, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentAddress(
			studentAddress, start, end, comparator);
	}

	public static List<Student> searchStudentByGroupId(long groupId) {
		return getService().searchStudentByGroupId(groupId);
	}

	public static List<Student> searchStudentByGroupId(
		long groupId, int start, int end) {

		return getService().searchStudentByGroupId(groupId, start, end);
	}

	public static List<Student> searchStudentByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Student> comparator) {

		return getService().searchStudentByGroupId(
			groupId, start, end, comparator);
	}

	public static List<Student> searchStudentByKeyWords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Student> comparator) {

		return getService().searchStudentByKeyWords(
			groupId, keywords, start, end, comparator);
	}

	public static List<Student> searchStudentCode(String studentCode)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentCode(studentCode);
	}

	public static List<Student> searchStudentCode(
			String studentCode, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentCode(studentCode, start, end);
	}

	public static List<Student> searchStudentCode(
			String studentCode, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentCode(
			studentCode, start, end, comparator);
	}

	public static List<Student> searchStudentEmail(String studentEmail)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentEmail(studentEmail);
	}

	public static List<Student> searchStudentEmail(
			String studentEmail, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentEmail(studentEmail, start, end);
	}

	public static List<Student> searchStudentEmail(
			String studentEmail, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentEmail(
			studentEmail, start, end, comparator);
	}

	public static List<Student> searchStudentGender(String studentGender)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentGender(studentGender);
	}

	public static List<Student> searchStudentGender(
			String studentGender, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentGender(studentGender, start, end);
	}

	public static List<Student> searchStudentGender(
			String studentGender, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentGender(
			studentGender, start, end, comparator);
	}

	public static List<Student> searchStudentName(String studentName)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentName(studentName);
	}

	public static List<Student> searchStudentName(
			String studentName, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentName(studentName, start, end);
	}

	public static List<Student> searchStudentName(
			String studentName, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentName(
			studentName, start, end, comparator);
	}

	public static List<Student> searchStudentPhone(String studentPhone)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentPhone(studentPhone);
	}

	public static List<Student> searchStudentPhone(
			String studentPhone, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentPhone(studentPhone, start, end);
	}

	public static List<Student> searchStudentPhone(
			String studentPhone, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentPhone(
			studentPhone, start, end, comparator);
	}

	public static long searchStudentsCountByKeywords(
		long groupId, String keywords) {

		return getService().searchStudentsCountByKeywords(groupId, keywords);
	}

	public static Student updateStudent(
			long studentId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateStudent(
			studentId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student the student
	 * @return the student that was updated
	 */
	public static Student updateStudent(Student student) {
		return getService().updateStudent(student);
	}

	public static StudentLocalService getService() {
		return _service;
	}

	public static void setService(StudentLocalService service) {
		_service = service;
	}

	private static volatile StudentLocalService _service;

}