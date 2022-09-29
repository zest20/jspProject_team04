package service.basket;

import java.io.IOException;
import java.sql.Array;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import control.CommandProcess;

public class DeleteChkBasketItemService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		//로그인 확인
		HttpSession session = request.getSession();
		String mem_id = (String)session.getAttribute("mem_id");
		
		if ( mem_id == null ) {
			return "/member/memLoginForm.jsp";
			
		}
		
		
		
		
		
		return null;
	}

}
