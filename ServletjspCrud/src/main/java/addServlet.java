
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PreparedStatement st1 = null;
		Connection con;

		PrintWriter out = response.getWriter();

		String sname = request.getParameter("sname");
		String course = request.getParameter("course");
		String addr = request.getParameter("address");
		String mobile = request.getParameter("mno");

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/studentifo", "root", "Aakash@1416");
			String query = "insert into student(sname,course,address,mno)values(?,?,?,?)";
			st1 = con.prepareStatement(query);

			st1.setString(1, sname);
			st1.setString(2, course);
			st1.setString(3, addr);
			st1.setString(4, mobile);
			int k = st1.executeUpdate();

			if (k == 1) {
				out.println("Thanks for registration ......");
				String query2 = "select max(id) from student";
				Statement st2 = con.createStatement();
				ResultSet rs1 = st2.executeQuery(query2);
				rs1.next();
				String reg_No = rs1.getString(1);
				out.println("Your registration id is " + reg_No);
			} else {
				out.println("Cant' update");
			}
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}

	}

}
