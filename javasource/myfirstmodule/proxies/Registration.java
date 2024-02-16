// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Registration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject registrationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Registration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RegistrationID("RegistrationID"),
		Registration_Programme("MyFirstModule.Registration_Programme"),
		Registration_CompletionDetails("MyFirstModule.Registration_CompletionDetails"),
		Registration_Account("MyFirstModule.Registration_Account");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Registration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Registration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject registrationMendixObject)
	{
		if (registrationMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, registrationMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.registrationMendixObject = registrationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Registration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Registration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Registration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Registration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Registration(context, mendixObject);
	}

	public static myfirstmodule.proxies.Registration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Registration.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Registration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Registration.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of RegistrationID
	 */
	public final java.lang.String getRegistrationID()
	{
		return getRegistrationID(getContext());
	}

	/**
	 * @param context
	 * @return value of RegistrationID
	 */
	public final java.lang.String getRegistrationID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RegistrationID.toString());
	}

	/**
	 * Set value of RegistrationID
	 * @param registrationid
	 */
	public final void setRegistrationID(java.lang.String registrationid)
	{
		setRegistrationID(getContext(), registrationid);
	}

	/**
	 * Set value of RegistrationID
	 * @param context
	 * @param registrationid
	 */
	public final void setRegistrationID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String registrationid)
	{
		getMendixObject().setValue(context, MemberNames.RegistrationID.toString(), registrationid);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Registration_Programme
	 */
	public final myfirstmodule.proxies.Programme getRegistration_Programme() throws com.mendix.core.CoreException
	{
		return getRegistration_Programme(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_Programme
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Programme getRegistration_Programme(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Programme result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_Programme.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Programme.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Registration_Programme
	 * @param registration_programme
	 */
	public final void setRegistration_Programme(myfirstmodule.proxies.Programme registration_programme)
	{
		setRegistration_Programme(getContext(), registration_programme);
	}

	/**
	 * Set value of Registration_Programme
	 * @param context
	 * @param registration_programme
	 */
	public final void setRegistration_Programme(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Programme registration_programme)
	{
		if (registration_programme == null) {
			getMendixObject().setValue(context, MemberNames.Registration_Programme.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Registration_Programme.toString(), registration_programme.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Registration_CompletionDetails
	 */
	public final myfirstmodule.proxies.CompletionDetails getRegistration_CompletionDetails() throws com.mendix.core.CoreException
	{
		return getRegistration_CompletionDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_CompletionDetails
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.CompletionDetails getRegistration_CompletionDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.CompletionDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_CompletionDetails.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.CompletionDetails.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Registration_CompletionDetails
	 * @param registration_completiondetails
	 */
	public final void setRegistration_CompletionDetails(myfirstmodule.proxies.CompletionDetails registration_completiondetails)
	{
		setRegistration_CompletionDetails(getContext(), registration_completiondetails);
	}

	/**
	 * Set value of Registration_CompletionDetails
	 * @param context
	 * @param registration_completiondetails
	 */
	public final void setRegistration_CompletionDetails(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.CompletionDetails registration_completiondetails)
	{
		if (registration_completiondetails == null) {
			getMendixObject().setValue(context, MemberNames.Registration_CompletionDetails.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Registration_CompletionDetails.toString(), registration_completiondetails.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Registration_Account
	 */
	public final administration.proxies.Account getRegistration_Account() throws com.mendix.core.CoreException
	{
		return getRegistration_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getRegistration_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Registration_Account
	 * @param registration_account
	 */
	public final void setRegistration_Account(administration.proxies.Account registration_account)
	{
		setRegistration_Account(getContext(), registration_account);
	}

	/**
	 * Set value of Registration_Account
	 * @param context
	 * @param registration_account
	 */
	public final void setRegistration_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account registration_account)
	{
		if (registration_account == null) {
			getMendixObject().setValue(context, MemberNames.Registration_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Registration_Account.toString(), registration_account.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return registrationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Registration that = (myfirstmodule.proxies.Registration) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
