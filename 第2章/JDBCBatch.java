	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class JDBCBatch {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Where is your MySQL JDBC Driver?");
				e.printStackTrace();
				return;
			}
			Connection connection = null;
	        PreparedStatement pstmt;
			try {
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/class3", "root", "123456");
				if (connection != null) {
					
					//���÷��Զ��ύ����ʼ������ķ�ʽ�ύ
					//connection.setAutoCommit(false);

					
					String query = "insert into student values (?,?)";
					pstmt = connection.prepareStatement(query);
					pstmt.setString(1,"1");
					pstmt.setString(2,"Peter");
					pstmt.addBatch();
					pstmt.setString(1,"2");
					pstmt.setString(2,"Mike");
					pstmt.addBatch();
					//ִ��������
					pstmt.executeBatch();	
					
					//�ύ����
					//connection.commit();

					
				} else {
					System.out.println("Failed to make connection!");
				}
			} catch (SQLException e) {
				System.out.println("Some of Students were not inserted correctly, please check the student table and insert manually.");
				e.printStackTrace();
			} finally {
				//��catch�һ�������쳣����Ҫ�ع�����  
//				try {
//					connection.rollback();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} 

				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
