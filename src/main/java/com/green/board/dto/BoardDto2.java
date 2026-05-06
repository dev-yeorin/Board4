package com.green.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
//@Getter
//@Setter
//@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 인자 생성자
public class BoardDto2 {
	// Fields
		private int    idx;
		private String menu_id;
		private String title;
		private String content;
		private String writer;
		private String regdate;
		private int	   hit;

}
