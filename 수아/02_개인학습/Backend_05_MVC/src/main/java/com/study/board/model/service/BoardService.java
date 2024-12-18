package com.study.board.model.service;

import java.util.List;

import com.study.board.model.dto.Board;

public interface BoardService {
	// 전체 게시글 조회
	public abstract List<Board> getList();
	// List<Board> getList(); 이 코드도 동일함. why? interface라서.
	// interface는 자동으로 public접근제어자를 가짐 & 자동으로 abstract 메서드로 취급됨 
	
	// 게시글 조회
	public abstract Board getBoard(int id);
	
	// 게시글 작성
	public abstract void writeBoard(Board board);
	
	// 게시글 수정 
	public abstract void modifyBoard(Board board);
	
	// 게시글 삭제
	public abstract void removeBoard(int id);
}
