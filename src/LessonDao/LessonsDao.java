/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LessonsDao;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Asel Peiris
 */
public class LessonsDao implements Dao<Lesson> {

    public static Connection getConnection() {
        Connection con = null;

        try {
            //Change the connection when integrating the database file is attached.
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }

    @Override
    public int addLesson(Lesson lesson) {
        int status = 0;
        try {
            Connection con = LessonsDao.getConnection();
            PreparedStatement pst = con
                    .prepareStatement("insert into lessons(subject_name, subject_credit, subject_maxmark) values(?, ?, ?)");

            pst.setString(1, lesson.getSubjectName());
            pst.setInt(2, lesson.getSubjectCredit());
            pst.setInt(3, lesson.getSubjectMaxmark());

            status = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public int deleteLesson(String subjectName) {
        int status = 0;
        try {
            Connection con = LessonsDao.getConnection();
            PreparedStatement pst = con.prepareStatement("delete from lessons where subject_name = ?");
            pst.setString(1, subjectName);
            status = pst.executeUpdate();

            con.close();
        } catch (Exception e) {

            e.printStackTrace();
        }

        return status;
    }

    @Override
    public Lesson getLessonById(int subjectId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateLessonByName(int subjectId, String subjectName, int subjectCredits, int maxMarks) {
        Connection con = LessonsDao.getConnection();
        
        int status = 0;
        try {
            PreparedStatement ps = con.prepareStatement("update lessons set subject_credit = ?, subject_maxmark = ? where subject_id = ?");
            ps.setInt(1, subjectCredits);
            ps.setInt(2, maxMarks);
            ps.setInt(3, subjectId);
            
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return status;
    }

    @Override
    public Lesson getLessonByName(String subjectName) {
        Lesson lesson = new Lesson();
        try {
            Connection con = LessonsDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from lessons where subject_name =?");
            ps.setString(1, subjectName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //lesson.setSubjectId(rs.getInt(1));
                lesson.setSubjectName(rs.getString(1));
                lesson.setSubjectCredit(rs.getInt(2));
                lesson.setSubjectMaxmark(rs.getInt(3));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lesson;
    }

}
