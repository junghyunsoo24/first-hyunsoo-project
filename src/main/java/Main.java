import persistence.MyBatisConnectionFactory;
import persistence.dao.BoardDAO;
import persistence.dao.MyBoardDAO;
import persistence.dto.BoardDTO;
import service.BoardService;
import view.BoardView;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]){
//        int command = 1;//selectAll
//        BoardDAO boardDAO = new BoardDAO();
//        BoardService boardService = new BoardService(boardDAO);//의존성 주입//객체지향에서 중요(외부에서 만들어서 넣어줌)
//        BoardView boardView = new BoardView();
//        if(command == 1) {
//            List<BoardDTO> all = boardService.findAll();
//            boardView.printAll(all);
//        }
        MyBoardDAO myBoardDAO = new MyBoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
//        List<BoardDTO> boardDTOS = myBoardDAO.findPostWithTitleLike("mybatis");
//        boardDTOS.stream().forEach(v-> System.out.println("v.toString() = " + v.toString()));
//        String title = "test";
//        String writer = "kim";
//        Map params = new HashMap<String, Object>();
//        params.put("title",title);
//        params.put("writer",writer);
//        List<BoardDTO> posts = myBoardDAO.findPostWithTitleNameLike(params);
//        System.out.println("posts.size() = " + posts.size());
//        posts.stream().forEach(p -> System.out.println(p.toString()));
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(1l);
        boardDTO.setTitle("test");
        boardDTO.setWriter("kim");
        List<BoardDTO> posts3 = myBoardDAO.findPostWithTitleNameLike3(boardDTO);
        System.out.println("posts2.size() = " + posts3.size());
        posts3.stream().forEach(p -> System.out.println(p.toString()));

    }
}
//insert,update,delete
//mybatis는 auto
//MyBoardDAO에 try에 session.commit()넣어주고 finally에 session.close()랑 session.rollback()넣어줘야 한다
