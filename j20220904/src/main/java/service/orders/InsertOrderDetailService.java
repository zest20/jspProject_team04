package service.orders;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.CommandProcess;

public class InsertOrderDetailService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		int size_num = Integer.parseInt(request.getParameter("size_num"));
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		
		String order_name = request.getParameter("buyername");
		String order_phone = request.getParameter("buyerphone");
		String order_email = request.getParameter("buyermail");
		String take_name = request.getParameter("receiver_name");
		String take_phone = request.getParameter("receiver_phone");
		
		
		
		return null;
	}

}