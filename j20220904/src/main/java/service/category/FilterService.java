package service.category;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import control.CommandProcess;
import dao.CategoryDAO;
import dto.Product_ImgSrcDTO;

public class FilterService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] brandArray = request.getParameterValues("brandArray");
		String size = request.getParameter("size");
		String gender = request.getParameter("gender");
		String ca_code = request.getParameter("ca_code");
		System.out.println("gender"+gender);
		System.out.println("ca_code->"+ca_code);
		
		System.out.println("FilterService size-->"+size);
			CategoryDAO cd = CategoryDAO.getInstance();
			List<Product_ImgSrcDTO> filterList = null;
			try {
				filterList = cd.selectSearch(brandArray,size,gender,ca_code);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("filterList", filterList);
			
			
		
		return "findFilter.jsp";
	}

}