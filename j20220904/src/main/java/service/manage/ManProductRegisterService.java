package service.manage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.CommandProcess;

public class ManProductRegisterService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("~~ManProductRegisterService 시작~~");
		
		try {
			// 신규 상품 등록
			int product_id = 0;
			String pageNum = request.getParameter("pageNum");
			
			if(pageNum == null) pageNum = "1";
			
			request.setAttribute("product_id", product_id);
			request.setAttribute("pageNum", pageNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "manProductRegister.jsp";
	}

}