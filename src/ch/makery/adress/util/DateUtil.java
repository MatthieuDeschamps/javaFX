package ch.makery.adress.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 *
 * @author mdeschamps
 */
public class DateUtil {
   //format de date à afficher 
   private static final String DATE_PATTERN = "dd.MM.yyyy";
   //date formateur
   private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
   
   
    public static String format(LocalDate date){
       if(date == null){
           return null;
       }
       return DATE_FORMATTER.format(date);
    } 
   
    public  static LocalDate parse(String dateString){
       try{
           return DATE_FORMATTER.parse(dateString, LocalDate::from);           
       }catch(DateTimeParseException e){
           return null;           
       }   
    }
    
    public static boolean validDate(String datString) {
        return DateUtil.parse(datString) != null;
        
    }
    
}
