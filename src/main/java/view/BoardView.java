package view;

import persistence.dto.BoardDTO;

import java.util.List;

public class BoardView {
    public void printAll(List<BoardDTO> dtos){
        for(BoardDTO dto:dtos){
            System.out.println("dto.toString() = " + dto.toString());
        }
    }
}
