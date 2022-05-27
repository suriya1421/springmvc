package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Doctor;

public class Doctordao {
	private static Connection getConnection() {
		String drivername = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "oracle";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private static java.sql.Date convertTosqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;

	}

	public static int insertDoctor(Doctor doc) {
		String insertquery = "insert into doctor(DOCTOR_ID,DOCTOR_NAME,DOB,SPECIALITY,CITY ,PHONE_NO ,STANDARD_FEES ) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, doc.getDOCTOR_ID());
			ps.setString(2, doc.getDOCTOR_NAME());
			//ps.setString(3, doc.getDOCTOR_NAME());
			ps.setDate(3, convertTosqlDate(doc.getDOB()));
			// convert java.util.Date to java.sql.date
			// ps.setDate(5, convertTosqlDate(newemp.getHire_date()));
			ps.setString(4, doc.getSPECIALITY());
			ps.setString(5, doc.getCITY());
			ps.setLong(6, doc.getPHONE_NO());
			ps.setFloat(7, doc.getSTANDARD_FEES());

			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}


public static int updateDoctor(Doctor newdoc) {
	String updatequery ="update doctor set doctor_name=?,dob=?,speciality=?,city=?,phone_no=?,standard_fees=? where doctor_id=?";
	Connection con=null;
	int rows =0;
	PreparedStatement ps =null;
	try {
		con =getConnection();
		ps= con.prepareStatement(updatequery);
		ps.setString(1, newdoc.getDOCTOR_NAME());
		ps.setDate(2, convertTosqlDate(newdoc.getDOB()));
		ps.setString(3, newdoc.getSPECIALITY());
		ps.setString(4, newdoc.getCITY());
		ps.setLong(5,newdoc.getPHONE_NO() );
		ps.setFloat(6, newdoc.getSTANDARD_FEES());
		ps.setInt(7,newdoc.getDOCTOR_ID());
		rows =ps.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return rows;
}
	
	public static int updateDoctorFirstName(int id, String name) {
		String updatequery = "update doctor set Doctor_NAME=? where doctor_id=?";
		Connection con = null;
		int rows = 0;
//			int rows ;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(2, id);
			ps.setString(1, name);

			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int updateDoctorFees(int id, float fees) {
		String updatequery = "update doctor set standard_fees=? where doctor_id=?";
		Connection con = null;
		int rows = 0;
//			int rows ;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(2, id);
			ps.setFloat(1, fees);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int deleteDoctor(int id) {
		String deletequery = "delete from doctor where doctor_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static Doctor getDoctorById(int id) {
		Doctor dr = null;
		String selectquery = "select doctor_id,DOCTOR_NAME,dob,speciality,city,PHONE_NO,STANDARD_FEES from doctor where doctor_id=?";// need
																																// change
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			dr = new Doctor();
			while (rs.next()) {
				dr.setDOCTOR_ID(rs.getInt(1));
				dr.setDOCTOR_NAME(rs.getString(2));
				// convert java.util.Date to java.sql.date
				dr.setDOB(rs.getDate(3));
				dr.setSPECIALITY(rs.getString(4));
				dr.setCITY(rs.getString(5));
				dr.setPHONE_NO(rs.getLong(6));
				dr.setSTANDARD_FEES((int) rs.getFloat(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dr;
	}

	public static List<Doctor> getAllDoctor() {
		List<Doctor> listOfDoctors = new ArrayList<Doctor>();
		Doctor dr = null;
		String selectquery = "select doctor_id,doctor_NAME,dob,speciality,city,phone_no,standard_fees from doctor";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();

			while (rs.next()) {
				dr = new Doctor();
				dr.setDOCTOR_ID(rs.getInt(1));
				dr.setDOCTOR_NAME(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				dr.setDOB(date);
				dr.setSPECIALITY(rs.getString(4));
				dr.setCITY(rs.getString(5));
				dr.setPHONE_NO(rs.getLong(6));
				dr.setSTANDARD_FEES(rs.getFloat(7));
				listOfDoctors.add(dr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfDoctors;
	}
}
