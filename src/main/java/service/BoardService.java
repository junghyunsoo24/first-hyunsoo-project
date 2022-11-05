package service;

import persistence.dao.BoardDAO;
import persistence.dto.BoardDTO;

import java.util.List;

public class BoardService {//dao를 이용한다
    private final BoardDAO boardDAO;

    public BoardService(BoardDAO boardDAO) {//의존성 주입
        this.boardDAO = boardDAO;
    }

    public List<BoardDTO> findAll(){
        List<BoardDTO> boardDTOS = boardDAO.findAll();
        return boardDTOS;
    }

}
