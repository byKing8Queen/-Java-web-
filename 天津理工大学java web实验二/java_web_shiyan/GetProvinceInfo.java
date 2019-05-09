package java_web_shiyan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetProvinceInfo
 */
@WebServlet("/GetProvinceInfo")
public class GetProvinceInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetProvinceInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		DBUtils db = new DBUtils();
		Connection connection = null;
		String sql = "select * from provinces";
		List<Province> list = new ArrayList<>();
		Province p = null;
		try {
			connection = db.getCon();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				p = new Province();
				p.setProvince(rs.getString("province"));
				list.add(p);
			}				
			Gson gson = new Gson();
			String json = gson.toJson(list);
			System.out.println(json);
			response.setContentType("text/json;chatset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.write(json);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
