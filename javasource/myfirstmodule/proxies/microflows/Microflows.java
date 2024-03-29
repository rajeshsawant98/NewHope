// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the MyFirstModule module
	public static void aCT_NewEvent(IContext context, myfirstmodule.proxies.Programme _programme)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Programme", _programme == null ? null : _programme.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_NewEvent").withParams(params).execute(context);
	}
	public static void aCT_NewFeedback(IContext context, myfirstmodule.proxies.Programme _programme)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Programme", _programme == null ? null : _programme.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_NewFeedback").withParams(params).execute(context);
	}
	public static administration.proxies.Account dS_GetCurrentUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_GetCurrentUser").withParams(params).execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, result);
	}
	public static myfirstmodule.proxies.RegistrationsCount dS_GetRegistrationsCount(IContext context, myfirstmodule.proxies.Programme _programme)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Programme", _programme == null ? null : _programme.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_GetRegistrationsCount").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.RegistrationsCount.initialize(context, result);
	}
	public static void newAccountClient(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.NewAccountClient").withParams(params).execute(context);
	}
	public static void newAccountClient_By_Volunteer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.NewAccountClient_By_Volunteer").withParams(params).execute(context);
	}
	public static void newAccountVolunteer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.NewAccountVolunteer").withParams(params).execute(context);
	}
	public static void oCH_SetUsername(IContext context, administration.proxies.Account _account, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Account", _account == null ? null : _account.getMendixObject());
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("MyFirstModule.OCH_SetUsername").withParams(params).execute(context);
	}
	public static void saveNewAccountClient(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("MyFirstModule.SaveNewAccountClient").withParams(params).execute(context);
	}
	public static void saveNewAccountVolunteer(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("MyFirstModule.SaveNewAccountVolunteer").withParams(params).execute(context);
	}
}
