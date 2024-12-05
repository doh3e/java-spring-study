package com.study.board.model.service;

import java.util.List;

import com.study.board.model.dto.Board;
import com.study.board.model.repository.BoardRepository;
import com.study.board.model.repository.BoardRepositoryImpl;

public class BoardServiceimpl implements BoardService {
	
	private static BoardService service = new BoardServiceimpl(); // 싱글턴
	private BoardRepository repo = BoardRepositoryImpl.getInstance(); // // 레포지토리 객체 주입 (의존성 주입)
	
	private BoardServiceimpl() {
	}
	
	// 꺼내쓸 수 있도록 
	public static BoardService getInstance() {
		return service;
	}
	
	
	
	// 각 메서드에서 레포지토리 호출하여 CRUD 수행
	
	
	
	@Override
	public List<Board> getList() {
		return repo.seletAll();
	}

	@Override
	public Board getBoard(int id) {
		repo.updateViewCnt(id);
		return repo.selecOne(id);
	}

	@Override
	public void writeBoard(Board board) {
		// 게시글 등록! Repository 호출
		repo.insertBoard(board); // 객체가져와서 메서드 동작 
	}

	@Override
	public void modifyBoard(Board board) {
		repo.updateBoard(board);
	}

	@Override
	public void removeBoard(int id) {
		repo.deleteBoard(id);
	}

}
