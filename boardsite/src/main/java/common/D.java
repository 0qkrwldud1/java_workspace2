package common;

public class D {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/boardsite";
	public static final String USERID = "myuser";
	public static final String USERPW = "k404";
	
	public static final String SQL_BOADR_INSERT = 
			"INSERT INTO board"
					+ "(bd_title, bd_content, user_ID)"
					+ "VALUES(?, ?, ?)";
	
	public static final String SQL_BOARD_SELECT =
			"SELECT bd_num num, bd_title title, bd_content content, user_ID user_ID, "
			+ "bd_viewcnt viewcnt, bd_regdate regdate " + "FROM board ORDER BY bd_num ASC";
	
	
	public static final String SQL_BOARD_SELECT_BY_NUM =
			"SELECT bd_num num, bd_title title, bd_content content, user_ID user_ID,"
			+ "bd_viewcnt viewcnt, bd_regdate regdate " + "FROM board WHERE bd_num = ?";
		
	public static final String SQL_BOARD_INC_VIEWCNT =
			"UPDATE board SET bd_viewcnt = bd_viewcnt + 1 WHERE bd_num = ?";
	
	public static final String SQL_BOARD_UPDATE = 
			"UPDATE board SET bd_title = ?, bd_content = ?, user_ID = ? WHERE bd_num = ?";
	
	public static final String SQL_BOARD_DELETE = 
			"DELETE FROM board WHERE bd_num = ?";

}
