import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;


public class LiquiMain {

	String dbProp = "./src/main/resources/user/db.properties";
	public static Connection connObj;
	public static String JDBC_URL = ";User=sa;Password=reallyStrongPwd123";
	public static String JDBC_HOST = "jdbc:sqlserver://localhost:1433;Database=ej_poc";
	public static String JBBC_USER = "sa";
	public static String JBBC_PASS = "reallyStrongPwd123";

	
	public static void getDbConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connObj = DriverManager.getConnection(JDBC_HOST,JBBC_USER,JBBC_PASS);
			if (connObj != null) {
				Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connObj));
				Liquibase liquibase = new liquibase.Liquibase("./changelog/version/db.changelog-1.0.xml", new ClassLoaderResourceAccessor(), database);
				liquibase.update(new Contexts(), new LabelExpression());

			}
		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws SQLException {
		getDbConnection();

	}

}
