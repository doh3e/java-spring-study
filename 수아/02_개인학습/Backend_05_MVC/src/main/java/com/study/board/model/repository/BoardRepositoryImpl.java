package com.study.board.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.study.board.model.dto.Board;


public class BoardRepositoryImpl implements BoardRepository{
	
	private static BoardRepository repo = new BoardRepositoryImpl(); // 싱글턴

	// 게시글 관리 - 메모리를 DB라고 생각 
	// 1. list로 관리
//	private List<Board> list = new ArrayList<>();
	// 2. map으로 관리
	private Map<Integer, Board> boards = new HashMap<>(); // // 메모리 기반 데이터 저장소

	private BoardRepositoryImpl() {
		boards.put(1, new Board("Study 완벽가이드", "KSAhh", "Spring Study 진행방향은 어디로...")); // 초기 데이터
	}
	
	// 밖에서 사용할 수 있도록 
	public static BoardRepository getInstance() {
		return repo;
	}
	
	
	
	// 각 메서드의 CRUD 로직
	
	@Override
	public List<Board> seletAll() {
		// 방식1) 
//		 return list // list로 관리하는 경우
		
		// 방식2) 
//		 return (List<Board>)boards.values();
		// 		boards.vlaues() : collection으로 반환
		// 		List<Board>로 강제 형변환
		
		// 방식3) map으로 관리하는 경우 
		List<Board> tmp = new ArrayList<>();
		for(int key : boards.keySet()) {
			tmp.add(boards.get(key));
		}
		return tmp;
	}

	@Override
	public Board selecOne(int id) {
		// 리스트면 반복문 돌려서 찾기
		
		// 맵이면 
		return boards.get(id);
	}

	@Override
	public void insertBoard(Board board) {
		boards.put(board.getId(), board); // ID를 키로 해서 맵으로 관리
		// list.add(board) // list로 사용하는 경우  
	}

	@Override
	public void updateBoard(Board board) {
		boards.put(board.getId(), board); // 맵인 경우 
	}

	@Override
	public void deleteBoard(int id) {
		// 리스트면 반복문으로 삭제
		
		// 맵이면 
		boards.remove(id);
		
	}

	@Override
	public void updateViewCnt(int id) {
		Board b = boards.get(id);
		b.setViewCnt(b.getViewCnt()+1);
	}

}
