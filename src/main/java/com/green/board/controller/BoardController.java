package com.green.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Board")
public class BoardController {

	// /Board/List
	@RequestMapping("List")
	public ModelAndView list() {
		
		List<BoardDto> boardList = boardMapper.getBoardList<>();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/list");
		mv.addObject("boardList", boardList);
		
	}
}
