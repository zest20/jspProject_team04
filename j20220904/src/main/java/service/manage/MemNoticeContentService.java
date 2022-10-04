package service.manage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.CommandProcess;
import dao.NoticeDAO;
import dto.NoticeDTO;

public class MemNoticeContentService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("MemNoticeContent Start");
		
		int notice_code = Integer.parseInt(request.getParameter("notice_code"));
		String pageNum = request.getParameter("pageNum");
		
		try {
			NoticeDAO nd = NoticeDAO.getInstance();
			
			/* 수정 ! (원문 : NoticeDTO notice = nd.select(notice_code); ) */
			NoticeDTO notice = nd.select(notice_code);
			NoticeDTO noticeBA = nd.selectBeforeAfter(notice_code);
			
			request.setAttribute("notice_code", notice_code);
			request.setAttribute("pageNum", pageNum);
			request.setAttribute("notice", notice);
			request.setAttribute("noticeBA", noticeBA);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "memNoticeContent.jsp";
	}
}