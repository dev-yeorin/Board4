package com.green.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.green.board.dto.BoardDto;
import com.green.board.mapper.BoardMapper;
import com.green.menus.dto.MenuDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/Board")
public class BoardController {
	
	@Autowired
	private  BoardMapper  boardMapper;
	
	// /Board/List?menu_id=MENU01
	@RequestMapping("/List")
	public  ModelAndView   list( MenuDTO  menuDto  ) {
		
		// List<BoardDto>  boardList  =  boardMapper.getBoardList( menuDto );
		List<BoardDto>  boardList  =  boardMapper.getBoardList2( "MENU01" );
		log.error("boardList:" + boardList);
		
		ModelAndView  mv  =  new  ModelAndView();
		mv.setViewName("board/list");
		mv.addObject("boardList", boardList);
		return  mv;
	}
	
}