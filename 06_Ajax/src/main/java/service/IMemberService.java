package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IMemberService {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
	// 응답에서 모든 백단 코드가 돌아간다~ /???/??
}
