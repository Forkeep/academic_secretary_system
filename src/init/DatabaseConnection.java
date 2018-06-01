package init;
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException;




//
//public class DatabaseConnection {
//	
//	    private static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ; 
//	    private static final String DBURL = "jdbc:mysql://localhost:3306/bugshi" ;
//	    private static final String DBUSER = "root" ;
//	    private static final String DBPASSWORD = "123456" ;
//	    private Connection conn = null ;
//	    
////	    public DatabaseConnection() throws SQLException { //在构造方法中进行数据库的连接
////	    	try{
////	        Class.forName(DBDRIVER) ;//加载数据库驱动
////	        this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;//连接数据库
////			}
////	    	catch(ClassNotFoundException e){
////				
////				throw e;
////			}
////	    
////	　　　　　　
////	    }
//	    public Connection getConnection(){ //取得数据库的连接操作
//	        return this.conn ;
//	    }
//	    
//	    public void close() throws Exception { //数据库的关闭操作
//	        if(this.conn != null){  //避免出现空指针异常
//	            try{
//	                this.conn.close() ;
//	            }catch(SQLException e){
//	                throw e ;
//	            }
//	        }
//	    }
//	
//}

public class DatabaseConnection {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/academic_secretary_system?characterEncoding=utf8&useSSL=true";
    //URL：jdbc:mysql://machine_name:port/dbname 
    //注：machine_name：数据库所在的机器的名称； 
    //port：端口号，默认3306


    private static final String user = "root";
    //这里写上用户名
    private static final String password = "1124";
    //这里写上密码
    private Connection conn = null;
    public DatabaseConnection() throws SQLException{
        try {
            Class.forName(driver);
            this.conn = DriverManager.getConnection(url, user, password);   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public Connection getConn() {
        return this.conn;
    }
    public void close(){
        if(this.conn != null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
