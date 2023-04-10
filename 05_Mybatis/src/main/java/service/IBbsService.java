package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionFoward;

public interface IBbsService {
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response);

}
