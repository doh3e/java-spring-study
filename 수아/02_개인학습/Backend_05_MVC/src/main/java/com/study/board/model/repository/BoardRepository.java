package com.study.board.model.repository;

import java.util.List;

import com.study.board.model.dto.Board;

public interface BoardRepository {
    List<Board> seletAll(); // 전체 게시글 조회
    Board selecOne(int id); // ID로 게시글 조회
    void insertBoard(Board board); // 게시글 등록
    void updateBoard(Board board); // 게시글 수정
    void deleteBoard(int id); // 게시글 삭제
    void updateViewCnt(int id); // 조회수 증가
}
