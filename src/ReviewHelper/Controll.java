/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author johnhill1202
 */
public class Controll {
    int quizno,mode;
    JSONParser parser = new JSONParser();
    public Object open_file(){
        try {
            Object obj = parser.parse(new FileReader("/home/johnhill1202/NetBeansProjects/ReviewHelper/quiz.json"));
            return obj;
        } catch (IOException ex) {
            Logger.getLogger(Controll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Controll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "a";
    }
    public void write_file(String jsonObject){
        try{
            File file = new File("/home/johnhill1202/NetBeansProjects/ReviewHelper/quiz.json");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jsonObject);
            fileWriter.flush();
            fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String Show_title(int i){
        Object obj=open_file();
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray quizzes = (JSONArray) jsonObject.get("Quizzes");
        JSONObject quiz = (JSONObject) quizzes.get(i);
        String title = (String) quiz.get("Title");
        return title;
   }
    public void add_term(String a, String b){
        Object obj=open_file();
        JSONObject jsonObject= (JSONObject) obj;
        JSONArray quizzes = (JSONArray) jsonObject.get("Quizzes");
        JSONObject quiz = (JSONObject) quizzes.get(quizno);
        JSONArray term = (JSONArray) quiz.get("Term");
        JSONObject jsonobj = new JSONObject();
        jsonobj.put("Answer",a);
        jsonobj.put("Question",b);
        term.add(jsonobj);
        write_file(jsonObject.toJSONString());
    }
    public void set_mode(int i){
        mode=i;
    }
    public int get_mode(){
        return mode;
    }
}
