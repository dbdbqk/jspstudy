package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionFoward;
import repository.BbsDAO;

public class BbsListService implements IBbsService {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("bbsList", BbsDAO.getInstance().selectAllBbsList());
		return new ActionFoward("bbs/list.jsp", false);
	}

}
