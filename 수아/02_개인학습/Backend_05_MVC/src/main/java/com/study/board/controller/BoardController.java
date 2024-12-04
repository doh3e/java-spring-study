package com.study.board.controller;

import java.io.IOException;

import com.study.board.model.dto.Board;
import com.study.board.model.service.BoardService;
import com.study.board.model.service.BoardServiceimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/board") // "/board"로 시작하는 모든 요청을 처리하는 서블릿
public class BoardController extends HttpServlet {
    private static final long serialVersionID = 1L;
    
    private BoardService service = BoardServiceimpl.getInstance(); // 서비스 계층 객체 생성(싱글턴)

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action"); // 요청된 action 값 추출

        // action 값에 따라 요청 처리 메서드 호출
        switch (action) {
            case "writeform":
                doWriteForm(request, response); // 게시글 작성 폼 표시
                break;
            case "write":
                doWrite(request, response); // 게시글 저장 처리
                break;
            case "list":
                doList(request, response); // 게시글 목록 조회
                break;
            case "detail":
                doDetail(request, response); // 게시글 상세 보기
                break;
            case "delete":
                doRemove(request, response); // 게시글 삭제
                break;
            case "updateform":
                doUpdateForm(request, response); // 게시글 수정 폼 표시
                break;
            case "update":
                doUpdate(request, response); // 게시글 수정 처리
                break;
            default:
                System.out.println("에러페이지로 이동"); // 예외 처리
                break;
        }
    }

    private void doWriteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/board/writeform.jsp").forward(request, response); // 작성 폼 JSP로 포워딩
    }

    private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 폼 데이터 추출
        String title = request.getParameter("title");
        String writer = request.getParameter("writer");
        String content = request.getParameter("content");

        // DTO 객체 생성 및 데이터 저장
        Board board = new Board(title, writer, content);
        service.writeBoard(board); // 서비스 계층 호출

        response.sendRedirect("board?action=list"); // 게시글 목록으로 리다이렉트
    }

    private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", service.getList()); // 게시글 목록 데이터 전달
        request.getRequestDispatcher("/WEB-INF/board/list.jsp").forward(request, response); // 목록 JSP로 포워딩
    }

    private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id")); // 요청에서 ID 추출
        request.setAttribute("board", service.getBoard(id)); // 게시글 데이터 전달
        request.getRequestDispatcher("/WEB-INF/board/detail.jsp").forward(request, response); // 상세보기 JSP로 포워딩
    }

    private void doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id")); // 요청에서 ID 추출
        service.removeBoard(id); // 게시글 삭제
        response.sendRedirect("board?action=list"); // 게시글 목록으로 리다이렉트
    }

    private void doUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id")); // 요청에서 ID 추출
        request.setAttribute("board", service.getBoard(id)); // 게시글 데이터 전달
        request.getRequestDispatcher("/WEB-INF/board/updateform.jsp").forward(request, response); // 수정 폼 JSP로 포워딩
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id")); // 요청에서 ID 추출
        Board board = service.getBoard(id); // 기존 게시글 데이터 가져오기
        board.setTitle(request.getParameter("title")); // 수정된 제목 설정
        board.setContent(request.getParameter("content")); // 수정된 내용 설정
        service.modifyBoard(board); // 수정 처리
        response.sendRedirect("board?action=list"); // 게시글 목록으로 리다이렉트
    }
}
