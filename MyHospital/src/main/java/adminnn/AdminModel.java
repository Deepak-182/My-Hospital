package adminnn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import city.dto.Patient;

public class AdminModel {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/";
	public static final String DB_NAME = "myhospital";
	public static final String USERNAME = "root";
	public static final String PASSWARD = "root";

	public static Connection creatConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL + DB_NAME, USERNAME, PASSWARD);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public int chackLogin(String user, String pass) {
		int i = 0;
		Connection con = null;
		try {
			con = creatConnection();
			PreparedStatement pp = con.prepareStatement("select *from adminlogin where uname = ? and passward = ?");
			pp.setString(1, user);
			pp.setString(2, pass);

			ResultSet rr = pp.executeQuery();
			if (rr.next()) {
				i = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int insertRecord(Patient pp) {
		int i = 0;
		Connection con = null;
		try {
			con = creatConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into patient(pname, gender, age, disease, bloodGroup, mobile) values(?, ?, ?, ?, ?, ?)");

			ps.setString(1, pp.getName());
			ps.setString(2, pp.getGender());
			ps.setInt(3, pp.getAge());
			ps.setString(4, pp.getDisease());
			ps.setString(5, pp.getBloodGroup());
			ps.setString(6, pp.getMobile());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	public ArrayList<Patient> getAllPatient() {

		ArrayList<Patient> al = new ArrayList<Patient>();
		Connection con = null;
		try {
			con = creatConnection();
			PreparedStatement pa = con.prepareStatement("select *from patient");
			ResultSet re = pa.executeQuery();
			while (re.next()) {
				Patient p = new Patient(re.getString("pname"), re.getString("gender"), re.getInt("age"),
						re.getString("disease"), re.getString("bloodGroup"), re.getString("mobile"));
				p.setPid(re.getInt("pid"));
				al.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}

	public int deletAllRecord(int id) {
		int i = 0;
		Connection con = null;
		try {
			con = creatConnection();
			PreparedStatement ps = con.prepareStatement("delete from patient where pid = ?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	public Patient getPatientRecord(int id) {
		Patient pt = null;
		Connection con = null;
		try {
			con = creatConnection();
			PreparedStatement pp = con.prepareStatement("select *from patient where pid =?");
			pp.setInt(1,id);
			ResultSet re = pp.executeQuery();
			if (re.next()) {
				pt = new Patient(re.getString("pname"), re.getString("gender"), re.getInt("age"),
						re.getString("disease"), re.getString("bloodGroup"), re.getString("mobile"));
				pt.setPid(re.getInt("pid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pt;
	}

	public int updatePatientRecord(Patient p) {
		int i = 0;
		Connection con = null;
		try {
			con = creatConnection();
			PreparedStatement ps = con.prepareStatement(
					"update patient set pname= ?, gender= ?, age=?, disease=?, bloodGroup=?, mobile=? where pid=? ");
			ps.setString(1, p.getName());
			ps.setString(2, p.getGender());
			ps.setInt(3, p.getAge());
			ps.setString(4, p.getDisease());
			ps.setString(5, p.getBloodGroup());
			ps.setString(6, p.getMobile());
			ps.setInt(7, p.getPid());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
