package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;

public interface IBoradService {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response);
	
}
