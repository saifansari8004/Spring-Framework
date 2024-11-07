package in.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.beans.Student;

public class StudentRowMapper implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Student stdStudent = new Student();
		stdStudent.setRollno(rs.getInt("std_rollno"));
		stdStudent.setName(rs.getString("std_name"));
		stdStudent.setMarks(rs.getFloat("std_marks"));
		return stdStudent;
	}

}
