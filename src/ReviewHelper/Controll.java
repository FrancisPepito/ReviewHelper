/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewHelper;

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
    JSONParser parser = new JSONParser();
    public Object open_file(){
        try {
            Object obj = parser.parse(new FileReader("/home/johnhill1202/Desktop/quiz.json"));
            return obj;
        } catch (IOException ex) {
            Logger.getLogger(Controll.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Controll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "a";
    }
    public String Show_title(int i){
        Object obj=open_file();
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray quizzes = (JSONArray) jsonObject.get("quizzes");
        JSONObject quiz = (JSONObject) quizzes.get(i);
        String title = (String) quiz.get("Title");
        return title;
   }
}
