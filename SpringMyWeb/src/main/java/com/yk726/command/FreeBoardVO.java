package com.yk726.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardVO {
	
	private int bno;
	private String writer;
	private String title;
	private String content;
	private Timestamp regdate; //java.sql패키지
	private Timestamp updatedate;
}
