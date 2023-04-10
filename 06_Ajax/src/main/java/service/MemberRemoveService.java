package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import repository.MemberDAO;

public class MemberRemoveService implements IMemberService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// MemberNo 파라미터 가져오기
		int memberNo = Integer.parseInt(request.getParameter("memberNo"));
		
		// MmemberNo  정보를 이용해 DB의 내용을  삭제
		int removeResult = MemberDAO.getInstance().deleteMember(memberNo);

		// 응답 데이터 형식 (JSON)
		response.setContentType("application/json; charset=UTF-8");
		
		// 응답 데이터 만들기
		/*
			{
				"updateResult": 1
			}
		 */
		JSONObject obj = new JSONObject();
		obj.put("removeResult", removeResult);
		
		// 응답
		PrintWriter out = response.getWriter();
		out.println(obj.toString());
		out.flush();
		out.close();		
		
	}

}
