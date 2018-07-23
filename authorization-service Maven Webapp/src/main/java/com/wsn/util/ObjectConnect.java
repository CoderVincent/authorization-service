package com.wsn.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wsn.pojo.Function;
import com.wsn.pojo.Role_authorization;
import com.wsn.pojo.UserAuthorization;
import com.wsn.pojo.User_role;

public class ObjectConnect {
	public static List<UserAuthorization> UAConnected(User_role ur,List<Role_authorization> roleAuthorizations){
		List<UserAuthorization> userAuthorizations = new ArrayList<>();
		Iterator<Role_authorization> iter = roleAuthorizations.iterator();
		List<Function> functions = new ArrayList<>();
		
		UserAuthorization ua = new UserAuthorization();
		ua.setAccount(ur.getUser().getAccount());
		ua.setPassword(ur.getUser().getPassword());
		ua.setRoleName(ur.getRole().getRole_name());
		ua.setRoleNumber(ur.getRole().getRole_number());
		
		while(iter.hasNext()){
			Function func = new Function();
			Role_authorization ra=iter.next();
			func.setfId(ra.getFunction().getfId());
			func.setFunctionName(ra.getFunction().getFunctionName());
			func.setFunctionNumber(ra.getFunction().getFunctionNumber());
			func.setDescription(ra.getFunction().getDescription());
			func.setResource(ra.getFunction().getResource());
			func.setOperate_type(ra.getFunction().getOperate_type());
			functions.add(func);
		}
		ua.setFunction(functions);
		userAuthorizations.add(ua);
		return userAuthorizations;
	}
}
